package scheduler;

public class EngineTask implements Task{

	@Override
	public void doWork() {
		System.out.println("Repair the engine");
	}

}
