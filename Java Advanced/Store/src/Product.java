import java.util.Random;


public class Product {
	
	private static Random rand = new Random();
	
	static String getCategory(String product){
		if(product.equals("Banana")||product.equals("Orange")||product.equals("Apple")){
			return "FRUITS";
		}else if(product.equals("Potato")||product.equals("Eggplant")||product.equals("Cucumber")){
			return "VEGETABLES";
		}else{
			return "MEAT";
		}
	}
	
	static String generateProduct(){
		int product = rand.nextInt(6) + 1;
		if(product==1){
			return "Banana";
		}
		else if(product == 2){
			return "Orange";
		}
		else if(product == 3){
			return "Apple";
		}
		else if(product==4){
			return "Potato";
		}
		else if(product == 5){
			return "Eggplant";
		}
		else if(product == 6){
			return "Cucumber";
		}else if(product==7){
			return "Pork";
		}
		else if(product == 8){
			return "Beef";
		}
		else{
			return "Chicken";
		}
	}
	
	static int generateQuantity(){
		int quantity = rand.nextInt(3) + 1;
		return quantity;
	}

}
