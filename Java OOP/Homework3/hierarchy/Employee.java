package hierarchy;

public class Employee extends Person{
	private double daySalary;
	Employee (String name, int age, boolean isMale, double daySalary){
		super(name, age, isMale);
		if(daySalary>0){
			this.daySalary = daySalary;
		}else{
			this.daySalary = 0;
		}
	}
	
	
	public double calculateOvertime(double hours){
		if(super.age<18){
			return 0;
		}else{
			return hours*((this.daySalary/8)*1.5);
		}
	}
	
	
	public void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.println("Day Salary: " + this.daySalary);
	}
}
