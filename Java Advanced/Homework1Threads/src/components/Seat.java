package components;

import java.util.Map;

public class Seat implements Runnable {

	private Map<String, Integer> builtTasks;
	public Seat(Map<String, Integer> builtTasks){
		this.builtTasks = builtTasks;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			builtTasks.put("Seat", builtTasks.get("Seat") + 1);
			System.out.println("Seat was built");
		} catch (InterruptedException e) {
			return;
		}
		
	}

}
