import instruments.Instrument;

import java.util.List;
import java.util.Random;


public class Client extends Thread{
	
	private Shop shop;
	
	Client(Shop shop){
		this.shop = shop;
	}
		
	@Override
	public void run() {
		while(true){
			String instrumentName = getRandomInstrument();
			int quantity = getRandomQuantity();
			this.shop.sellInstrument(instrumentName, quantity);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	String getRandomInstrument(){
		List<Instrument> list = shop.getListOfInstrumentsSortedByName();
		Random rand = new Random();
		int index = rand.nextInt(list.size());
		return list.get(index).getName();
	}
	
	int getRandomQuantity(){
		Random rand = new Random();
		return rand.nextInt(3) + 1;//1:3
		
	}
}
