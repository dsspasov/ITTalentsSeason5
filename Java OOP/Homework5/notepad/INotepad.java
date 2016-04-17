package notepad;

public interface INotepad {
	
	void edit(int id, String text);
	
	void write(int id, String text);
	
	void deleteText(Page page);
	
	void deleteText(int id);
	
	void printPages();
	
	boolean searchWord(String word);
	
	void printAllPagesWithDigits();
}
