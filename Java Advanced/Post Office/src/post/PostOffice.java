package post;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import human.PostBoy;
import shipments.Letter;
import shipments.Parcel;
import shipments.Shipment;

public class PostOffice extends Thread {
	TreeMap<LocalDate, TreeMap<LocalTime, ArrayList<Shipment>>> shipments = new TreeMap<LocalDate, TreeMap<LocalTime, ArrayList<Shipment>>>();
	List<Shipment> storage = new ArrayList<Shipment>();
	List<PostBoy> postBoys = new ArrayList<PostBoy>();
	List<PostBox> postBoxes = new ArrayList<PostBox>();

	private final static int REVISION_TIME = 24;// hours;
	
	
	public void addPostBoy(PostBoy pb) {
		postBoys.add(pb);
	}

	public void addPostBox(PostBox pb) {
		postBoxes.add(pb);
	}

	public void addShipment(Shipment s, LocalDateTime d) {
		if (shipments.containsKey(d.toLocalDate())) {
			if (shipments.get(d.toLocalDate()).containsKey(d.toLocalTime())) {
				shipments.get(d.toLocalDate()).get(d.toLocalTime()).add(s);
			} else {
				shipments.get(d.toLocalDate()).put(d.toLocalTime(), new ArrayList<Shipment>());
				shipments.get(d.toLocalDate()).get(d.toLocalTime()).add(s);
			}
		} else {
			shipments.put(d.toLocalDate(), new TreeMap<LocalTime, ArrayList<Shipment>>());
			shipments.get(d.toLocalDate()).put(d.toLocalTime(), new ArrayList<Shipment>());
			shipments.get(d.toLocalDate()).get(d.toLocalTime()).add(s);
		}

		storage.add(s);
	}

	public List<Shipment> getShipmentsForDate(LocalDate d) {
		List<Shipment> shipments = new LinkedList<Shipment>();
		for (Map.Entry<LocalTime, ArrayList<Shipment>> t : this.shipments.get(d).entrySet()) {
			shipments.addAll(t.getValue());

		}
		return shipments;
	}

	public double getPercentageOfLetters(LocalDate d) {
		int letters = 0;
		for (Map.Entry<LocalTime, ArrayList<Shipment>> t : this.shipments.get(d).entrySet()) {
			for (Shipment s : t.getValue()) {
				if (s.getType().equals("Letter")) {
					letters++;
				}
			}
		}
		int allShipments = this.getShipmentsForDate(d).size();

		return ((double) letters) / allShipments;
	}

	public double getPercentageOfBreakableParcels() {
		int parcels = 0;
		int breakable = 0;
		for (Map.Entry<LocalDate, TreeMap<LocalTime, ArrayList<Shipment>>> x : shipments.entrySet()) {
			for (Map.Entry<LocalTime, ArrayList<Shipment>> y : x.getValue().entrySet()) {
				for (Shipment shipment : y.getValue()) {
					if (shipment.getType().equals("Parcel")) {
						parcels++;
						if (((Parcel) shipment).isBreakable()) {
							breakable++;
						}
					}
				}
			}
		}

		return ((double) breakable) / parcels;
	}

	public synchronized void gatherLetters(){
		if(storage.size()<50){
			for(PostBoy pb: postBoys){
				pb.getLettersFromPostBox(postBoxes.get(new Random().nextInt(postBoxes.size()-1)));
				for(Map.Entry<LocalDateTime, ArrayList<Letter>> letters:pb.getListOfLetters().entrySet()){
					for(Letter letter:letters.getValue()){
						addShipment(letter, letters.getKey());
						pb.setIsFree(true);
					}
				}
			}
			notifyAll();
		}else{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void givePostBoysShipmnets() {
		if (storage.size() > 50) {
			int freePostBoys = 0;
			for (PostBoy pb : postBoys) {
				if (pb.isFree()) {
					freePostBoys++;
				}
			}
			int numberOfShipments = storage.size() / freePostBoys;
			for (PostBoy pb : postBoys) {
				if (pb.isFree()) {
					pb.addShipmentFromPostOffice(storage.subList(0, numberOfShipments));
					storage.removeAll(storage.subList(0, numberOfShipments));
					pb.setIsFree(false);
					
				}
			}
			
			for (PostBoy pb : postBoys) {
				pb.deliverShipments();
			}
			notifyAll();
	
		}else{
			try {
				wait();
			} catch (InterruptedException e) {
			}
			
		}
	}

	public List<PostBoy> getPostBoysInfo() {
		postBoys.sort(new Comparator<PostBoy>() {
			@Override
			public int compare(PostBoy o1, PostBoy o2) {
				return o1.getNumbeOfShipments() - o2.getNumbeOfShipments();
			}
		});

		return postBoys;

	}

	public void saveToFile() {
		for (Map.Entry<LocalDate, TreeMap<LocalTime, ArrayList<Shipment>>> pratki : shipments.entrySet()) {
			File file = new File("File" + pratki.getKey().toString() + ".txt");
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
				StringBuilder sb = new StringBuilder();
				for (Map.Entry<LocalTime, ArrayList<Shipment>> t : pratki.getValue().entrySet()) {
					sb.append(t.getKey().toString() + ":");
					for (Shipment sh : t.getValue()) {
						sb.append("\t" + sh.toString() + "\n");
					}
				}
				bw.write(sb.toString());
				sb.delete(0, sb.length());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void run() {

		while (true) {

			saveToFile();

			try {
				Thread.sleep(REVISION_TIME * 60 * 60 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
