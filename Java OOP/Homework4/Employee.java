public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allwork = null;

	Employee(String name) {
		this.setName(name);
		this.currentTask = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			if (name.length() > 0)
				this.name = name;
		} else {
			System.out.println("No name!");
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		} else {
			this.currentTask = new Task("", 0);
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft > 0)
			this.hoursLeft = hoursLeft;
		else
			this.hoursLeft = 0;
	}

	void work() {
		while (this.hoursLeft > 0) {
			if (this.currentTask == null) {
				this.currentTask = Employee.allwork.getNextTask();
			}
			if (this.currentTask == null) {
				break;
			} else {
				System.out.println(this.name + " works on " + this.currentTask.getName());
				this.workOnTask();
				if (this.currentTask.getWorkingHours() == 0) {
					this.currentTask = Employee.allwork.getNextTask();
				}
			}
		}
	}

	private void workOnTask() {
		// hours for the day >= task hours
		if (this.hoursLeft >= this.currentTask.getWorkingHours()) {
			this.hoursLeft -= this.currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);// task is done
			System.out.println(this.name + " finished "
					+ this.currentTask.getName());

			// hours for the day < task hours
		} else if (this.hoursLeft < this.currentTask.getWorkingHours()) {
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()
					- this.hoursLeft);
			this.hoursLeft = 0;// End of day
			System.out.println(this.name + " will work on "
					+ this.currentTask.getName() + " tomorrow");
		}
	}

	void startWorkingDay() {
		this.setHoursLeft(8);
	}

	void showReport() {
		String report = "Name: " + this.name + ", Hours left: "
				+ this.hoursLeft + "|";
		System.out.print(report);
		System.out.println(this.currentTask.toString());
	}

	public static AllWork getAllwork() {
		return allwork;
	}

	public static void setAllwork(AllWork allwork) {
		Employee.allwork = allwork;
	}
}
