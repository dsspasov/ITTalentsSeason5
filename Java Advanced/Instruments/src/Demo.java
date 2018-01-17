public class Demo {
	public static void main(String[] args) {
		
		Shop shop = new Shop();
		Supplier supplier = new Supplier(shop);
		shop.setSupplier(supplier);
		Client client = new Client(shop);
		ShopInfo shopInfo = new ShopInfo(shop);
		
		supplier.start();
		client.start();
		shopInfo.start();
		
		//System.out.println(shop);
		
		
		/*
		 * System.out.println(shop.getListOfInstrumentsSortedByType());
		 * System.out.println(shop.getListOfInstrumentsSortedByName());
		 * System.out.println(shop.getListOfInstrumentsSortedByPrice("DSC"));
		 * System.out.println(shop.getListOfInstrumentsOnStock());
		 * System.out.println(shop.getListOfSoldInstruments());
		 * 
		 * System.out.println(shop.getBestSellingProduct());
		 * System.out.println(shop.getLeastSellingProduct());
		 * System.out.println(shop.getTotalProfit());
		 * 
		 * System.out.println(shop.getBestSellingCategory());
		 * System.out.println(shop.getCategoryMaxProfit());
		 */
		
		//System.out.println(shop.getCash());
	}
}
