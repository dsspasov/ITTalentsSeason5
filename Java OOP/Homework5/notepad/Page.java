package notepad;

public class Page {
	private String title;
	private String text;
	
	Page(){
		this("","");
	}
	
	Page(String title){
		this(title, "");
	}
	
	Page(String title, String text){
		this.title = title;
		this.text = text;
	}

	public void addText(String text){
		this.text = text;
	}

	public String getText(){
		return this.text;
	}
	
	public void deleteText(){
		this.text = "";
	}
	
	public String reviewPage(){
		return this.title + "\n" + this.text;
	}
	
	public boolean searchWord(String word){
		return text.contains(word);
	}

	public boolean containsDigits(){
		return text.matches("(.)*[0-9](.)*");
	}
}
