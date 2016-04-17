package notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad{
	
	private String password;
	
	SecuredNotepad(String password){
		this(password, 0);
	}
	
	SecuredNotepad(String password, int numberOfPages){
		super(numberOfPages);
		if(passwordValidation(password)){
			this.password = password;
		}else{
			//System.out.println("Password is weak");
			//this.password = password;
			throw new IllegalArgumentException("Password is weak");	
		}
	}
	
 	private String getPass(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = sc.next();
		return password;
	}

	private boolean checkPassword(String pass){
		return this.password.equals(pass);
	}
	
	private static boolean passwordValidation(String pass){
		if(pass.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")&&pass.length()>=5){
			return true;
		}else{
			return false;
		}
	}
		
	@Override
	public void edit(int id, String text) {
		if(this.checkPassword(this.getPass())){
			super.edit(id, text);
			System.out.println("Text was added");
		}else{
			System.out.println("Wrong password!");
		}
	}

	@Override
	public void write(int id, String text) {
		if(this.checkPassword(this.getPass())){
			super.write(id, text);
			System.out.println("Text was written");
		}else{
			System.out.println("Wrong password!");
		}
	}

	public void deleteText(int id){
		if(this.checkPassword(this.getPass())){
			super.deleteText(id);
		}else{
			System.out.println("Wrong password!");
		}
	}
	
	@Override
	public void printPages() {
		if(this.checkPassword(this.getPass())){
			super.printPages();
		}else{
			System.out.println("Wrong password!");
		}
	}

	@Override
	public boolean searchWord(String word) {
		if(this.checkPassword(this.getPass())){
			return super.searchWord(word);
		}else{
			System.out.println("Wrong password!");
			return false;
		}
	}
	
	@Override
	public void printAllPagesWithDigits() {
		if(this.checkPassword(this.getPass())){
			super.printAllPagesWithDigits();
		}else{
			System.out.println("Wrong password!");
		}
	}
	
	public void addPageTitle(int id, String title){
		if(this.checkPassword(this.getPass())){
			super.addPageTitle(id, title);
		}else{
			System.out.println("Wrong password!");
		}	
	}

}
