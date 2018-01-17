package human;

public abstract class Person {
	protected String fName;
	protected String lName;
	
	public Person(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}
	
	@Override
	public String toString() {
		return fName + " " + lName;
	}
}
