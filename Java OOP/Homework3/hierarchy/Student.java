package hierarchy;

public class Student extends Person{
	private double score;
	
	
	
	//������ �������� ��������� � �� �������� ����������� �� superclass-a, �� ������������ 
	//������� ����������� ��� �������� �� superclass-a, ��� ��� �����. ��� ���� ������ �� ����
	//�� ������ ��� ����������� �� �� ������.
	//���� �� ������ ���� � ������������ �� Student ����
	//������� ��� ����������� �� superclass-a �� �� ������ ��� � person ����������� ����������� ��� ���������.
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
