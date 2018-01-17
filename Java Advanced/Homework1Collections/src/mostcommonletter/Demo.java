package mostcommonletter;

public class Demo {
	public static void main(String[] args) {
		LetterStatistics stats = new LetterStatistics();
		
		String text = "His name is Slim Shady!";
		//text = "aaaAaAAxAAaA";
		//text = "AAAAAAAAAAAAAAAAAAAAAAAAX";
		//text = "aaaaaaaaaabbbbb";
		
		stats.getStatisticsResult(text);
	}
}
