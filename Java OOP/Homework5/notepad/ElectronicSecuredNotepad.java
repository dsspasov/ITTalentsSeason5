package notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice{

	private boolean switchOn = false;
	
	
	ElectronicSecuredNotepad(String password) {
		super(password, 10);
		this.start();
	}
	
	ElectronicSecuredNotepad(String password, int numberOfPages) {
		super(password, numberOfPages);
		this.start();
	}

	@Override
	public void start() {
		if(!this.switchOn)
			this.switchOn = true;
		
	}

	@Override
	public void stop() {
		if(this.switchOn)
			this.switchOn = false;
	}

	@Override
	public boolean isStarted() {
		return this.switchOn;
	}
	
	@Override
	public void edit(int id, String text) {
		if(this.isStarted()){
			super.edit(id, text);
		}else{
			System.out.println("The electronic notepad is stopped!");
		}
	}

	@Override
	public void write(int id, String text) {
		if(this.isStarted()){
			super.write(id, text);
		}else{
			System.out.println("The electronic notepad is stopped!");
		}
	}

	public void deleteText(int id){
		if(this.isStarted()){
			super.deleteText(id);
		}else{
			System.out.println("The electronic notepad is stopped!");
		}
			
	}
	
	@Override
	public void printPages() {
		if(this.isStarted()){
			super.printPages();
		}else{
			System.out.println("The electronic notepad is stopped!");
		}
	}

	@Override
	public boolean searchWord(String word) {
		if(this.isStarted()){
			return super.searchWord(word);
		}else{
			System.out.println("The electronic notepad is stopped!");
			return false;
		}
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if(this.isStarted()){
			super.printAllPagesWithDigits();
		}else{
			System.out.println("The electronic notepad is stopped!");
		}
	}
	
	public void addPageTitle(int id, String title){
		if(this.isStarted()){
			super.addPageTitle(id, title);
		}else{
			System.out.println("The electronic notepad is stopped!");
		}
	}
}
