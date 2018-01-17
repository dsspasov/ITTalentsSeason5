import instruments.Instrument;

import java.util.List;
import java.util.Map;
import java.util.Random;


public class ShopInfo extends Thread {

	private Shop shop;
	ShopInfo(Shop s){
		this.shop = s;
	}
	
	@Override
	public void run() {
		while(true){
			getInfo();
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	void getInfo(){
		Random rand = new Random();
		int choice = rand.nextInt(4)+1;
		if(choice==1){
			System.out.println("Total profit: " + shop.getTotalProfit());
		}else if(choice == 2){
			Map.Entry<String, Double> result = shop.getCategoryMaxProfit();
			if(result==null){
				return;
			}else{
				System.out.println("We gain most of our profit form:");
				System.out.println("\tCategory: " + result.getKey() + ", Profit: " + result.getValue());
			}
		}else if(choice == 3){
			 List<Map.Entry<Instrument, Integer>> resultList = shop.getListOfSoldInstruments();
			 System.out.println("SOLD INSTRUMENTS");
			 for(Map.Entry<Instrument, Integer> entry: resultList){
				 System.out.println("\tInstrument: " + entry.getKey() + " - Quantity: " + entry.getValue());
			 }
		}else if(choice == 4){
			List<Instrument> resultList = shop.getListOfInstrumentsSortedByName();
			System.out.println("LIST OF INSTRUMENTS SORTED BY NAME");
			for(Instrument instrument: resultList){
				System.out.println("\tInstrument " + instrument);
			}	
		}
	}
	
}
