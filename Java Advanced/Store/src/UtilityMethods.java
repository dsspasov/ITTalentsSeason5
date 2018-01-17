import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class UtilityMethods {
	static List<String> getDepleteProducts(HashMap<String, HashMap<String, Integer>> products, int min){
		List<String> depleted = new LinkedList<String>();
		for(HashMap<String, Integer> product :products.values()){
			for(String p:product.keySet()){
				if(product.get(p)<=min){
					depleted.add(p);
				}
			}
		}
		return depleted;
	}
}
