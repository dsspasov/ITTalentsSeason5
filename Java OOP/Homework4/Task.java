
public class Task {
	private String name;
	private int workingHours;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name!=null){
			if(name.length()>0)
				this.name = name;
		}else{
			this.name = "Relax";
		}
	}
		
	public int getWorkingHours() {
		return workingHours;
	}
	
	public void setWorkingHours(int workingHours) {
		if(workingHours>0){
			this.workingHours = workingHours;
		}else{
			this.workingHours = 0;
		}
	}
	
	Task(String name, int workingHours){
		this.setName(name);
		this.setWorkingHours(workingHours);	
	}

	@Override
	public String toString() {
		String text = this.name + ", task hours left: " + this.workingHours;
		return text;
	}
}
