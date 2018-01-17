package human;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import post.PostBox;
import shipments.Letter;
import shipments.Shipment;

public class PostBoy extends Person{

	private final static int DELIVER_TIME_LETTER = 10; // minutes
	private final static int DELIVER_TIME_PARCEL = 15;//minutes
	
	private int staj;
	private boolean isFree = true;
	private Map<LocalDateTime, ArrayList<Letter>> listOfLetters = new HashMap<LocalDateTime, ArrayList<Letter>>();
	
	private List<Shipment> shipments = new LinkedList<Shipment>();
	
	public PostBoy(String fName, String lName, int staj) {
		super(fName, lName);
		this.staj = staj;
	}
	
	public void setIsFree(boolean isFree){
		this.isFree = isFree;
	}
	
	public boolean isFree(){
		return isFree;
	}
	
	public void getLettersFromPostBox(PostBox p){
		Map<LocalDateTime, ArrayList<Letter>> letters = p.getLetters();
		for(LocalDateTime d: letters.keySet()){
			if(listOfLetters.containsKey(d)){
				ArrayList<Letter> allLetters = listOfLetters.get(d);
				allLetters.addAll(letters.get(d));
				listOfLetters.put(d, allLetters);
			}else{
				listOfLetters.put(d, letters.get(d));
			}
		}
		letters.clear();
	}
	
	public void addShipmentFromPostOffice(List<Shipment> s){
		shipments.addAll(s);
	}

	public int getNumbeOfShipments(){
		return this.shipments.size();
	}

	public void deliverShipments() {
		for(Shipment s: shipments){
			try {
				if(s.getType().equals("Letter")){
					Thread.sleep(DELIVER_TIME_LETTER*60*1000);
				}else{
					Thread.sleep(DELIVER_TIME_PARCEL*60*1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		isFree =true;
	}
	
	public Map<LocalDateTime, ArrayList<Letter>> getListOfLetters() {
		return listOfLetters;
	}

}
