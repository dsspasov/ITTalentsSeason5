package hierarchy;

public class Student extends Person{
	private double score;
	
	
	
	//Когато съдаваме костуктор и не извикаме конструктор от superclass-a, то компилаторът 
	//извиква конструктор без парамтри от superclass-a, ако има такъв. Ако няма трябва да явно
	//да укажем кой конструктор да се извика.
	//Това се оправя като в конструктора на Student явно
	//зададем кой конструктор от superclass-a да се извика или в person декларираме конструктор без параметри.
	Student(){
		super("", 0, false);
		}
	
	Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		if(score>=2&&score<=6){
			this.score = score;
		}else{
			this.score = 2;
		}
	}
	
	public void showStudentInfo(){
		showPersonInfo();
		System.out.println("Score: " + this.score);
	}
}
