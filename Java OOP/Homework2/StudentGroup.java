public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	StudentGroup() {
		this.students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String groupSubject) {
		this();
		this.groupSubject = groupSubject;
	}

	void addStudent(Student s) {
		if (s != null) {
			if (this.freePlaces > 0 && s.getSubject().equalsIgnoreCase(this.groupSubject)) {
				this.students[this.students.length - this.freePlaces] = s;
				freePlaces--;
			}
		}
	}

	void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	String theBestStudent() {
		int index = 0;
		for (int i = 1; i < this.students.length - this.freePlaces; i++) {
			if (students[index].getGrade() < students[i].getGrade()) {
					index = i;
				}
			}
		return students[index].getName();
	}

	void printStudentsInGroup(){
		System.out.println(this.groupSubject);
		for(int i = 0; i < this.students.length - this.freePlaces; i++){
			this.students[i].printInfo();
		}
	}
}
