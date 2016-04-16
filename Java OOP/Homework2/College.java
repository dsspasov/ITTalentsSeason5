
public class College {
	public static void main(String[] args) {
		Student ivan = new Student("Ivan", "IER", 25);
		Student joro = new Student("Joro", "IER", 52);
		Student gosho = new Student("Gosho", "Software Engineering", 18);
		Student pesho = new Student("Pesho", "Informatics", 20);
		
		ivan.receiveSchoolarShip(3, 120);
		gosho.receiveSchoolarShip(3.5, 120);
		
		pesho.upYear();
		joro.upYear();
		
		StudentGroup Informatics = new StudentGroup("Informatics");
		StudentGroup SoftEngineering = new StudentGroup("Software Engineering");
		StudentGroup IER = new StudentGroup("IER");
		
		Informatics.addStudent(pesho);
		SoftEngineering.addStudent(gosho);
		SoftEngineering.addStudent(null);
		
		SoftEngineering.printStudentsInGroup();
		
		IER.addStudent(ivan);
		IER.addStudent(joro);
		joro.setGrade(6);
		
		IER.printStudentsInGroup();
		System.out.println(IER.theBestStudent());
	}
}
