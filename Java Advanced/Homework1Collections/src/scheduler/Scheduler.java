package scheduler;

import java.util.LinkedList;
import java.util.Queue;

public class Scheduler {

	private Queue<Task> tasks = new LinkedList<Task>();
	
	void push(Task t){
		System.out.println("Task was added to the queue");
		tasks.offer(t);
	}
	
	void main(){
		while(!tasks.isEmpty()){
			tasks.poll().doWork();
		}
	}
}
