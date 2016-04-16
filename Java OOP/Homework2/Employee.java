public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;

	Employee(String name) {
		this.setName(name);
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
		if (this.hoursLeft > this.currentTask.getWorkingHours()) {
			this.hoursLeft -= this.currentTask.getWorkingHours();
			this.currentTask.setWorkingHours(0);
		} else {
			this.currentTask.setWorkingHours(this.currentTask.getWorkingHours()
					- this.hoursLeft);
			this.hoursLeft = 0;
		}
	}

	void showReport() {
		String report = "Name: " + this.name + ", Task: " + this.currentTask.getName() + ", Hours left: " + this.hoursLeft + ", Task hours left: " + this.currentTask.getWorkingHours();
		System.out.println(report);
	}
}
