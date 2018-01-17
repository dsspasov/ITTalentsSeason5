package components;

import java.util.Map;

public class Frame implements Runnable{

	
	private Map<String, Integer> builtTasks;
	public Frame(Map<String, Integer> builtTasks){
		this.builtTasks = builtTasks;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			builtTasks.put("Frame", builtTasks.get("Frame") + 1);
			System.out.println("Frame was built");
		} catch (InterruptedException e) {
			return;
		}
		
	}

}
