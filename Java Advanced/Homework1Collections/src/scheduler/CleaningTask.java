package scheduler;

public class CleaningTask implements Task{

	@Override
	public void doWork() {
		System.out.println("Clean your room");
	}

}
