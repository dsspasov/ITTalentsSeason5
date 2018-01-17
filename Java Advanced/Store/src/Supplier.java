
public class Supplier extends Thread{
	Store store;
	Supplier(Store store){
		this.store = store;
	}
	@Override
	public void run() {
		while(true){
			store.addProducts();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
