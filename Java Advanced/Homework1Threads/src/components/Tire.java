package components;

import java.util.Map;

public class Tire implements Runnable{

	private Map<String, Integer> builtTasks;
	public Tire(Map<String, Integer> builtTasks){
		this.builtTasks = builtTasks;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			builtTasks.put("Tire", builtTasks.get("Tire") + 1);
			System.out.println("Tire was built");
		} catch (InterruptedException e) {
			return;
		}
		
	}

}
