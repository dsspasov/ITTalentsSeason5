package components;

import java.util.Map;

public class Car implements Runnable {

	private Map<String, Integer> builtTasks;

	public Car(Map<String, Integer> builtTasks) {
		this.builtTasks = builtTasks;
	}

	@Override
	public void run() {
		if(isEmpty()){
			return;
		}else{
			while (hasEnoughParts()) {
				builtTasks.put("Tire", builtTasks.get("Tire") - 4);
				builtTasks.put("Seat", builtTasks.get("Seat") - 5);
				builtTasks.put("Frame", builtTasks.get("Frame") - 1);
				builtTasks.put("Engine", builtTasks.get("Engine") - 1);
				System.out.println("A car was construct");
				//System.out.println(builtTasks.toString());
			}
		}
		
	}

	boolean hasEnoughParts() {
		if (builtTasks.get("Engine") >= 1 && builtTasks.get("Seat") >= 5
				&& builtTasks.get("Tire") >= 4 && builtTasks.get("Frame") >= 1) {
			return true;
		}
		return false;
	}
	
	boolean isEmpty(){
		if (builtTasks.get("Engine") ==0 && builtTasks.get("Seat")==0
				&& builtTasks.get("Tire") ==0 && builtTasks.get("Frame") ==0) {
			return true;
		}
		return false;
		
	}

}
