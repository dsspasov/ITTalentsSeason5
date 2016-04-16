
public class Demo {
	public static void main(String[] args) {
		Employee ivan = new Employee("Ivan");
		Employee gosho = new Employee("Gosho");
		Task task1 = new Task("Build a wall", 11);
		
		ivan.setHoursLeft(8);
		ivan.setCurrentTask(task1);
		ivan.work();
		ivan.showReport();
		
		gosho.setHoursLeft(8);
		gosho.setCurrentTask(task1);
		gosho.work();
		gosho.showReport();
	}
}
