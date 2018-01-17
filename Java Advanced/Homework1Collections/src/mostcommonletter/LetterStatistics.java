package mostcommonletter;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LetterStatistics {
	
	private static final int MAX_DIGIT_FORMAT = 3; 
	Map<Character, Integer> letterOccurrences = new HashMap<Character, Integer>();
	// letter->numberOfOccurrences

	private void countOccurrencesOfLetters(String text) {
		text = text.toUpperCase();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
				if (letterOccurrences.containsKey(text.charAt(i))) {
					letterOccurrences.put(text.charAt(i),
							letterOccurrences.get(text.charAt(i)) + 1);
				} else {
					letterOccurrences.put(text.charAt(i), 1);
				}
			}
		}
	}

	//sorting list of entries
	/*
	private void sortMap(){
		List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(letterOccurrences.entrySet());
		Collections.sort(list, new Comparator<Entry<Character, Integer>>() {
			@Override
			public int compare(Entry<Character, Integer> o1,
					Entry<Character, Integer> o2) {
				if(o1.getValue()>o2.getValue())
					return -1;
				if(o1.getValue()<o2.getValue())
					return 1;
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		letterOccurrences.clear();
		letterOccurrences = new LinkedHashMap<Character,Integer>();
		for(Iterator<Entry<Character, Integer>> it = list.iterator(); it.hasNext();){
			Entry<Character, Integer> entry = it.next();
			letterOccurrences.put(entry.getKey(), entry.getValue());
		}
	}
	*/
	
	private void sort(){
		Map<Character, Integer> sortedResult = new TreeMap<Character, Integer>(new Comparator<Character>(){
			@Override
			public int compare(Character o1, Character o2) {
				if(letterOccurrences.get(o1)>letterOccurrences.get(o2)){
					return -1;
				}
				if(letterOccurrences.get(o1)<letterOccurrences.get(o2)){
					return 1;
				}
				return o1.compareTo(o2);
			}
			
		});
		
		sortedResult.putAll(letterOccurrences);
		letterOccurrences = sortedResult;
	}
	
	private void printResult(){
		for(Entry<Character, Integer> entry: letterOccurrences.entrySet()){
			String percentage = "";
			int i = 0;
			while(i<entry.getValue()){
				percentage += "#";
				i++;
			}
			
			System.out.printf("%c - %-"+MAX_DIGIT_FORMAT+"d : %s \n", entry.getKey(), entry.getValue(), percentage);
		}
	}
	
	public void getStatisticsResult(String text){
		countOccurrencesOfLetters(text);
		sort();
		printResult();
		
	}
}
