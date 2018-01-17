package scheduler;

public class FoodTask implements Task{

	@Override
	public void doWork() {
		System.out.println("Buy food");
	}

}
