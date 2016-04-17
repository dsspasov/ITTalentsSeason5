
public class Demo {
	public static void main(String[] args) {
		AllWork tasks = new AllWork();
		tasks.addTask(new Task("Feed the Dog", 7));
		tasks.addTask(new Task("Build House", 9));
		tasks.addTask(new Task("Paint Wall", 14));
		tasks.addTask(new Task("Buy Food", 12));
		tasks.addTask(new Task("Clean the house", 11));
		tasks.addTask(new Task("Watch TV", 2));
		tasks.addTask(new Task("Play WOW", 7));
		tasks.addTask(new Task("Pay Rent", 11));
		tasks.addTask(new Task("Do Homework", 2));
		tasks.addTask(new Task("Play WOW again", 7));
		tasks.addTask(new Task("Watch TV again", 7));

		Employee.setAllwork(tasks);

		
		Employee pesho = new Employee("Petar");
		Employee gosho = new Employee("Gosho");
		int day =1;
		while(!tasks.isAllWorkDone()){
			System.out.println("Day " + day);
			pesho.startWorkingDay();
			pesho.work();
			gosho.startWorkingDay();
			gosho.work();
			day++;

		}
		System.out.println("All work is done");
	}
}
