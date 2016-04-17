package notepad;

public class SimpleNotepad implements INotepad {

	private Page[] pages;
	
	protected SimpleNotepad(){
		this(10);
	}

	protected SimpleNotepad(int numberOfPages){
		if(numberOfPages>0){
			this.pages = new Page[numberOfPages];
		}else{
			this.pages = new Page[10];
		}
		
		for(int i = 0; i<this.pages.length; i++){
			this.pages[i] = new Page();
		}
	}
	
	@Override

	public void edit(int id, String text) {
		this.write(id, this.pages[id-1].getText() + text);
	}

	@Override
	public void write(int id, String text) {
		if(id>0&&id<=this.pages.length){
			this.pages[id-1].addText(text);
		}else{
			System.out.println("This page is missing");
		}
	}

	public void deleteText(int id){
		if(id>0&&id<=this.pages.length)
			this.deleteText(this.pages[id-1]);
			
	}
	
	@Override
	public void deleteText(Page page) {
		if(page!=null){
			page.deleteText();
			System.out.println("Deleting text");
		}
		else
			System.out.println("Sorry!The page doesn't exist!");
	}

	@Override
	public void printPages() {
		for(int i = 0; i<this.pages.length; i++){
			if(this.pages[i]!=null){
				System.out.println("===Page"+(i+1)+"====");
				System.out.println(this.pages[i].reviewPage());
			}
		}
	}

	public void addPageTitle(int id, String title){
		if(id>0&&id<=this.pages.length){
			this.pages[id-1] = new Page(title, this.pages[id-1].getText());
			System.out.println("A page title was added");
		}else{
			System.out.println("There is no such page");
		}
	}

	@Override
	public boolean searchWord(String word) {
		for(Page page:pages){
			if(page.searchWord(word))
				return true;
		}
		return false;
	}
	
	@Override
	public void printAllPagesWithDigits() {
		for(Page page:pages){
			if(page.containsDigits()){
				System.out.println(page.reviewPage());
			}
		}
	}

	
}
