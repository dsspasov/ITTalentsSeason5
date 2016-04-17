package hierarchy;

public class Person {
	protected String name;
	protected int age;
	protected boolean isMale;
	
	protected Person(String name, int age, boolean isMale){
		this.name = name;
		this.isMale = isMale;
		if(age>=0)
			this.age = age;
		else
			this.age = 0;
	}
	
	protected void showPersonInfo(){
		String text = "Name: "+this.name + ", Age: " + this.age + ", ";
		text = text + (isMale?"Man":"Woman");
		System.out.println(text);
	}

}
