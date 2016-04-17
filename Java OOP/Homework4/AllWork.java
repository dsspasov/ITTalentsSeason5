
public class AllWork {

	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;
	
	AllWork(){
		this.tasks = new Task[10];
		this.freePlacesForTasks = 10;
		this.currentUnassignedTask = 0;
	}
	
	void addTask(Task newTask){
		if(newTask!=null&&this.freePlacesForTasks>0){
			this.tasks[this.tasks.length - this.freePlacesForTasks] = newTask;
			System.out.println("A task was added");
			this.freePlacesForTasks--;
		}else{
			System.out.println("The task list is full");
		}
	}
	
	Task getNextTask(){
		if(this.currentUnassignedTask<this.tasks.length - this.freePlacesForTasks){
			return this.tasks[this.currentUnassignedTask++];
		}else{
			return null;
		}
	}
	
	boolean isAllWorkDone(){
		for(int i = 0; i<this.tasks.length - this.freePlacesForTasks; i++){
			if(this.tasks[i]!=null){
				if(this.tasks[i].getWorkingHours()!=0){
					return false;
				}
			}
		}
		return true;
	}
}
