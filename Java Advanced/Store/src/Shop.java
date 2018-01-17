import java.util.HashMap;
import java.util.List;

public class Shop extends Thread{
	private static final int PRODUCT_SUPPLY_MIN = 5;

	Store store;
	private HashMap<String, HashMap<String, Integer>> productsOnStock = new HashMap<String, HashMap<String, Integer>>();
	Shop(Store store){
		this.store = store;
		productsOnStock.put("FRUITS", new HashMap<String, Integer>());
		productsOnStock.get("FRUITS").put("Banana", 0);
		productsOnStock.get("FRUITS").put("Orange", 0);
		productsOnStock.get("FRUITS").put("Apple", 0);
		productsOnStock.put("VEGETABLES", new HashMap<String, Integer>());
		productsOnStock.get("VEGETABLES").put("Potato", 0);
		productsOnStock.get("VEGETABLES").put("Eggplant", 0);
		productsOnStock.get("VEGETABLES").put("Cucumber", 0);
		productsOnStock.put("MEAT", new HashMap<String, Integer>());
		productsOnStock.get("MEAT").put("Pork", 0);
		productsOnStock.get("MEAT").put("Beef", 0);
		productsOnStock.get("MEAT").put("Chicken", 0); 
	}
	
	@Override
	public void run() {
		while(true){
			addProductToShop();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void addProductToShop(){
		List<String> depleted = UtilityMethods.getDepleteProducts(productsOnStock, PRODUCT_SUPPLY_MIN);
		if(depleted.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			for(String product:depleted){
				String category = Product.getCategory(product);
				store.getProduct(product);
				productsOnStock.get(category).put(product, productsOnStock.get(category).get(product) + 5);		
				System.out.println("Shop product " + product + " was added, quantity: " + productsOnStock.get(category).get(product));
			}
			notifyAll();
		}
	}
	
	public synchronized void sellProduct(String product, int quantity){
		String category = Product.getCategory(product);
		if(productsOnStock.get(category).get(product)<=5){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			productsOnStock.get(category).put(product, productsOnStock.get(category).get(product) - quantity);
			System.out.println("Product " + product + " was bought, quantity in shop: " + productsOnStock.get(category).get(product));
			notifyAll();
		}
	}
}
