import instruments.Instrument;
import instruments.percussion.Drum;
import instruments.string.Bass;
import instruments.string.Guitar;
import instruments.string.Viola;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Shop {
	private static final int QUANTITY_DELIVERED = 2;
	private long timeOfLastDelivery = 0;
	private double cash;
	private Map<String, HashMap<Instrument, Integer>> products = new HashMap<String, HashMap<Instrument, Integer>>();
	private Map<Instrument, Integer> soldProducts = new HashMap<Instrument, Integer>();
	private Supplier supplier;
	
	Shop(){
		this.cash = 0;
		this.addProduct(new Bass("BassAf45", 120), 5);
		this.addProduct(new Guitar("GuitarGt87", 256), 5);
		this.addProduct(new Drum("DrumD98", 58), 5);
		this.addProduct(new Viola("ViolaV1I", 400), 5);
	}

	void setSupplier(Supplier s){
		this.supplier = s;
	}
	
	public synchronized void sellInstrument(String name, int quantity){
		for(HashMap<Instrument, Integer> instrumentsByCategory: products.values()){
			for(Instrument instrument:instrumentsByCategory.keySet()){
				if(instrument.getName().equals(name)){
					if(instrumentsByCategory.get(instrument)>=quantity){
						cash += instrument.getPrice()*quantity;
						instrumentsByCategory.put(instrument , instrumentsByCategory.get(instrument) - quantity);
						if(soldProducts.containsKey(instrument)){
							soldProducts.put(instrument, soldProducts.get(instrument) + quantity);
						}else{
							soldProducts.put(instrument, quantity);
						}
						System.out.println("Instryment " + instrument.getName() + " was sold, quantity remains: " + instrumentsByCategory.get(instrument));
						notifyAll();
					}else{
						System.out.println("Not enough in stock of " + instrument.getName());
						long waitTime = 0;
						if(timeOfLastDelivery == 0){
							waitTime = 5000;
						}else{
							waitTime = (5000-(System.currentTimeMillis()-timeOfLastDelivery));
						}
						waitTime += supplier.getInfoForInstrument(instrument.getName(), quantity);
						waitTime /= 1000;
						System.out.println("You have to wait " + waitTime + " seconds");
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
					}
				}
			}
		}
	}
	
	//the name of instrument dont give any information about it's type or price, so i use an instrument
	public void addProduct(Instrument instrument, int quantity){
		if(products.containsKey(instrument.getType())){
			if(products.get(instrument.getType()).containsKey(instrument)){
				products.get(instrument.getType()).put(instrument, products.get(instrument.getType()).get(instrument) + quantity);
			}else{
				products.get(instrument.getType()).put(instrument, quantity);
			}
		}else{
			products.put(instrument.getType(), new HashMap<Instrument, Integer>());
			products.get(instrument.getType()).put(instrument, quantity);
		}
		
	}
	//used
	public synchronized List<Instrument> getListOfInstrumentsSortedByType(){
		LinkedList<Instrument> list = new LinkedList<Instrument>();
		for(HashMap<Instrument, Integer> instruments:products.values()){
			list.addAll(instruments.keySet());
		}
		list.sort(new Comparator<Instrument>() {
			@Override
			public int compare(Instrument o1, Instrument o2) {
				return o1.getType().compareToIgnoreCase(o2.getType());
			}
		});
		
		return list;
	}
	
	public List<Instrument> getListOfInstrumentsSortedByName(){
		LinkedList<Instrument> list = new LinkedList<Instrument>();
		for(HashMap<Instrument, Integer> instruments: products.values()){
			list.addAll(instruments.keySet());
		}
		
		list.sort(new Comparator<Instrument>() {
			@Override
			public int compare(Instrument o1, Instrument o2) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});

		return list;
	}
	
	public List<Instrument> getListOfInstrumentsSortedByPrice(String orderType){
		LinkedList<Instrument> list = new LinkedList<Instrument>();
		for(HashMap<Instrument, Integer> instruments: products.values()){
			list.addAll(instruments.keySet());
		}
		if(orderType.equals("DSC")){
			list.sort(new Comparator<Instrument>() {
				@Override
				public int compare(Instrument o1, Instrument o2) {
					if(o1.getPrice()>o2.getPrice()){
						return -1;
					}else if(o1.getPrice()<o2.getPrice()){
						return 1;
					}
					return 0;
				}
			});
		}else{
			list.sort(new Comparator<Instrument>() {
				@Override
				public int compare(Instrument o1, Instrument o2) {
					if(o1.getPrice()>o2.getPrice()){
						return 1;
					}else if(o1.getPrice()<o2.getPrice()){
						return -1;
					}
					return 0;
				}
			});
		}

		return list;
	}
	
	public List<Instrument> getListOfInstrumentsOnStock(){
		LinkedList<Instrument> list = new LinkedList<Instrument>();
		for(HashMap<Instrument, Integer> instruments: products.values()){
			for(Map.Entry<Instrument, Integer> instrument:instruments.entrySet()){
				if(instrument.getValue()>0){
					list.add(instrument.getKey());
				}
			}
		}
		return list;
	}
	
	//used
	public synchronized List<Map.Entry<Instrument, Integer>> getListOfSoldInstruments(){
		List<Map.Entry<Instrument, Integer>> listOfInstruments = new LinkedList<Map.Entry<Instrument, Integer>>(this.soldProducts.entrySet());
		listOfInstruments.sort(new Comparator<Map.Entry<Instrument, Integer>>() {
			@Override
			public int compare(Entry<Instrument, Integer> o1, Entry<Instrument, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		return listOfInstruments;
	}
	//used
	public synchronized double getTotalProfit(){
		double profit = 0;
		for(Map.Entry<Instrument, Integer> instrument: soldProducts.entrySet()){
			profit += instrument.getValue() * instrument.getKey().getPrice();
			
		}
		return profit;
	}
	
	public Map.Entry<Instrument, Integer>  getBestSellingProduct(){
		Map.Entry<Instrument, Integer>  instrument = null;
		Integer max = null;
		for(Map.Entry<Instrument, Integer> currentInstrument: soldProducts.entrySet()){
			if(max == null || max<currentInstrument.getValue()){
				max = currentInstrument.getValue();
				instrument = currentInstrument;
			}
		}
		return instrument;
	}
	
	public Map.Entry<Instrument, Integer>  getLeastSellingProduct(){
		Map.Entry<Instrument, Integer>  instrument = null;
		Integer max = null;
		for(Map.Entry<Instrument, Integer> currentInstrument: soldProducts.entrySet()){
			if(max == null || max>currentInstrument.getValue()){
				max = currentInstrument.getValue();
				instrument = currentInstrument;
			}
		}
		return instrument;
	}
	
	public Map.Entry<String, Integer> getBestSellingCategory(){
		Integer maxSum = null;
		Map.Entry<String, Integer> category = null; 
		HashMap<String, Integer> categorySoldQuantity = new HashMap<String, Integer>();
		for(Map.Entry<Instrument, Integer> instrument: soldProducts.entrySet()){
			if(categorySoldQuantity.containsKey(instrument.getKey().getType())){
				categorySoldQuantity.put(instrument.getKey().getType(), categorySoldQuantity.get(instrument.getKey().getType())+instrument.getValue());
			}else{
				categorySoldQuantity.put(instrument.getKey().getType(), instrument.getValue());
			}
		}
	
		for(Map.Entry<String, Integer> categoryEntry: categorySoldQuantity.entrySet()){
			if(maxSum == null || maxSum<categoryEntry.getValue()){
				maxSum = categoryEntry.getValue();
				category = categoryEntry;
			}
		}
		
		return category;
	}
	
	//used
	public synchronized Map.Entry<String, Double> getCategoryMaxProfit(){
		Double maxProfit = null;
		Map.Entry<String, Double> category = null; 
		HashMap<String, Double> categorySoldQuantity = new HashMap<String, Double>();
		for(Map.Entry<Instrument, Integer> instrumentEntry: soldProducts.entrySet()){
			Double price = instrumentEntry.getKey().getPrice() * instrumentEntry.getValue();
			String type = instrumentEntry.getKey().getType();
			if(categorySoldQuantity.containsKey(type)){
				price += categorySoldQuantity.get(type);
			}
			
			categorySoldQuantity.put(type, price);
		}
		
		for(Map.Entry<String, Double> categoryEntry: categorySoldQuantity.entrySet()){
			if(maxProfit == null || maxProfit<categoryEntry.getValue()){
				maxProfit = categoryEntry.getValue();
				category = categoryEntry;
			}
		}
		
		return category;
	}
	
	public double getCash(){
		return cash;
	}

	@Override
	public String toString() {
		return "Shop [cash=" + cash + ", products=" + products + "]";
	}

	public synchronized void deliverInstruments(Supplier supplier){
		List<Instrument> depleted = getDepletedInstruments();
		if(depleted.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			for(Instrument instrument: depleted){
				Instrument delivered = supplier.deliverInstrument(instrument.getName(), QUANTITY_DELIVERED);
				this.cash -= QUANTITY_DELIVERED * delivered.getPrice();
				delivered.setPrice(delivered.getPrice() + 100);
				products.get(instrument.getType()).put(delivered, QUANTITY_DELIVERED);
				int quantity = products.get(instrument.getType()).get(delivered);
				System.out.println("Instrument "+ instrument.getName() +" was delivered to shop, quantity: " + quantity); 
			}
			timeOfLastDelivery = System.currentTimeMillis();
			notifyAll();
		}
	} 
	
	private List<Instrument> getDepletedInstruments(){
		List<Instrument> list = new LinkedList<Instrument>();
		
		for(HashMap<Instrument, Integer> instrumentsByType:products.values()){
			for(Instrument instrument: instrumentsByType.keySet()){
				if(instrumentsByType.get(instrument)<=3){
					list.add(instrument);
				}
			}
		}
		
		return list;
	}
}
