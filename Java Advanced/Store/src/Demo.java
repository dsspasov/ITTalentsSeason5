
public class Demo {
	public static void main(String[] args) {
		Store s = new Store();
		Supplier sup = new Supplier(s);
		Shop shop1 = new Shop(s);
		Shop shop2 = new Shop(s);
		Shop shop3 = new Shop(s);
		Client client1 = new Client(shop1);
		Client client2 = new Client(shop1);
		Client client3 = new Client(shop1);
		Client client4 = new Client(shop2);
		Client client5 = new Client(shop2);
		Client client6 = new Client(shop2);
		Client client7 = new Client(shop3);
		Client client8 = new Client(shop3);
		Client client9 = new Client(shop3);
		sup.start();
		shop1.start();
		shop2.start();
		shop3.start();
		
		client1.start();
		client2.start();
		client3.start();
		client4.start();
		client5.start();
		client6.start();
		client7.start();
		client8.start();
		client9.start();
	}
	
	
}
