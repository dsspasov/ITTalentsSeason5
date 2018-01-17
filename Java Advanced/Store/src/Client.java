
public class Client extends Thread {

	Shop shop;
	Client(Shop shop){
		this.shop = shop;
	}
	
	@Override
	public void run() {
		while(true){
			shop.sellProduct(Product.generateProduct(), Product.generateQuantity());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
