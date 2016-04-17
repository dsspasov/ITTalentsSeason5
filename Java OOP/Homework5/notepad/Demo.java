package notepad;

public class Demo {
	public static void main(String[] args) {
		SimpleNotepad simple = new SimpleNotepad(4);
		simple.addPageTitle(1, "Page1");
		simple.addPageTitle(2, "Page2");
		simple.addPageTitle(3, "Page3");
		simple.addPageTitle(4, "Page4");
		simple.addPageTitle(5, "Page4");
		
		simple.printPages();
		
		simple.write(1, "Some text to page 1");
		simple.write(6, "skcascas");
		simple.write(2, "Some text to page 2");
		
		simple.printPages();
		
		simple.edit(2, "TEXT TEXT TEXT 2");
		
		simple.printPages();
		simple.printAllPagesWithDigits();
		
		
		SimpleNotepad secure = new SecuredNotepad("A12bcF", 4);
		
		secure.addPageTitle(1, "Title1");
		secure.addPageTitle(2, "Title2");
		secure.addPageTitle(3, "Title3");
		secure.addPageTitle(4, "Title4");
		
		secure.printPages();
		
		
		secure.write(1, "Text");
		secure.write(2, "Text2");
		
		secure.printAllPagesWithDigits();
		
		
		
		ElectronicSecuredNotepad electronicSecured = new ElectronicSecuredNotepad("A12bcF", 4);
		electronicSecured.addPageTitle(1, "Title1");
		electronicSecured.addPageTitle(2, "Title2");
		electronicSecured.addPageTitle(3, "Title3");
		electronicSecured.addPageTitle(4, "Title4");
		
		electronicSecured.write(1, "Text to page 1");
		electronicSecured.write(2, "Text to page 2");
		
		electronicSecured.printPages();
		
		electronicSecured.deleteText(2);
		electronicSecured.printPages();
		
		System.out.println("END");
		
		
	}
}
