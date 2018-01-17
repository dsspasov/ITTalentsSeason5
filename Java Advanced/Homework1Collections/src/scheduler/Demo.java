package scheduler;

public class Demo {

	public static void main(String[] args) {
		Scheduler scheduler = new Scheduler();
		scheduler.push(new EngineTask());
		scheduler.push(new FoodTask());
		scheduler.push(new TVTask());
		scheduler.push(new CleaningTask());
		scheduler.push(new DogFoodTask());
		scheduler.push(new DogTask());
		
		scheduler.main();
	}
}
