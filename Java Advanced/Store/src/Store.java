import java.util.List;
import java.util.HashMap;


public class Store {
	private static final int PRODUCT_SUPPLY_QUANTITY = 25;
	private static final int PRODUCT_SUPPLY_MIN = 10;
	private static final int SHOP_SUPPLY_PRODUCT_QUANTITY = 5;
	private static final int SHOP_SUPPLY_MIN = 5;
	private HashMap<String, HashMap<String, Integer>> products = new HashMap<String, HashMap<String, Integer>>();
	Store(){
		products.put("FRUITS", new HashMap<String, Integer>());
		products.get("FRUITS").put("Banana", 15);
		products.get("FRUITS").put("Orange", 15);
		products.get("FRUITS").put("Apple", 15);
		products.put("VEGETABLES", new HashMap<String, Integer>());
		products.get("VEGETABLES").put("Potato", 15);
		products.get("VEGETABLES").put("Eggplant", 15);
		products.get("VEGETABLES").put("Cucumber", 15);
		products.put("MEAT", new HashMap<String, Integer>());
		products.get("MEAT").put("Pork", 15);
		products.get("MEAT").put("Beef", 15);
		products.get("MEAT").put("Chicken", 15);
	}
		
	synchronized void addProducts(){
		List<String> depletedProducts = UtilityMethods.getDepleteProducts(products, PRODUCT_SUPPLY_MIN);
		if(depletedProducts.isEmpty()){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			for(String product:depletedProducts){
				String category = Product.getCategory(product);
				products.get(category).put(product, products.get(category).get(product) + PRODUCT_SUPPLY_QUANTITY);
				System.out.println("Product " + product + " is added in store, quantity: " + products.get(category).get(product));
			} 
			notifyAll();
		}
	}

	synchronized void getProduct(String product){
		String type = Product.getCategory(product);
		if(products.get(type).get(product)<=SHOP_SUPPLY_MIN){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			products.get(type).put(product, products.get(type).get(product) - SHOP_SUPPLY_PRODUCT_QUANTITY);
			System.out.println("Product " + product + " was decreased in store, quantity: " + products.get(type).get(product));
			notifyAll();
		}
	}
}
