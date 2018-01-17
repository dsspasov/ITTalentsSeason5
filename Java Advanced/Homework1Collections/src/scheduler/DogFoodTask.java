package scheduler;

public class DogFoodTask implements Task{

	@Override
	public void doWork() {
		System.out.println("Feed the dog");
		
	}

}
