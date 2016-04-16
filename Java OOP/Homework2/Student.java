public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		if (age > 0)
			this.age = age;
		else
			this.age = 1;
	}

	void upYear() {
		if (this.yearInCollege >= 4) {
			this.isDegree = true;
		}
		if (!this.isDegree) {
			this.yearInCollege++;
		} else {
			System.out.println("You are graduated!");
		}
	}

	double receiveSchoolarShip(double min, double amount) {
		if (amount > 0 && min > 2) {
			if (this.age < 30 && this.grade >= min) {
				this.money += amount;
			}
		}
		return this.money;
	}

	public void setGrade(double grade) {
		if (grade >= 2 && grade <= 6) {
			this.grade = grade;
		} else {
			System.out.println("Sorry! Wrong grande!");
		}
	}

	public String getSubject() {
		return subject;
	}

	public String getName() {
		return name;
	}

	public double getGrade() {
		return grade;
	}

	public void printInfo() {
		String text = "Name: " + this.name + ", " + this.age + ", "
				+ this.yearInCollege + ", " + this.grade + ", " + this.money
				+ ", " + this.isDegree + "\n";
		System.out.println(text);
	}

}
