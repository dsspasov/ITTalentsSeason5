package post;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import shipments.Letter;

public class PostBox {
	
	private Map<LocalDateTime, ArrayList<Letter>> letters;
	
	public PostBox() {
		letters = new HashMap<LocalDateTime, ArrayList<Letter>>();
	}

	public Map<LocalDateTime, ArrayList<Letter>> getLetters() {
		return letters;
	}
	
	public void addLetter(Letter l, LocalDateTime d){
		if(letters.containsKey(d)){
			letters.get(d).add(l);
		}else{
			letters.put(d, new ArrayList<Letter>());
			letters.get(d).add(l);
		}
	}
	
	
	
}
