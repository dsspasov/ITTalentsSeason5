package components;
import java.util.Map;

public class Engine implements Runnable{

	private Map<String, Integer> builtTasks;
	public Engine(Map<String, Integer> builtTasks){
		this.builtTasks = builtTasks;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(7000);
			builtTasks.put("Engine", builtTasks.get("Engine") + 1);
			System.out.println("Engine was built");
		} catch (InterruptedException e) {
			return;
		}
		
	}

}
