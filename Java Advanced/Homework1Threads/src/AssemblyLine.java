import static java.util.concurrent.TimeUnit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import components.*;

public class AssemblyLine {

	public static void main(String[] args) {

		// FIRST SOLUTION
		buildNCars(2);
		// SECOND SOLUTION
		//build cars for time in seconds
		//buildCars(15);
	}

	public static void buildNCars(int number) {
		ArrayList<Runnable> tasks = new ArrayList<Runnable>();
		Map<String, Integer> builtTasks = new HashMap<String, Integer>();
		builtTasks.put("Engine", 0);
		builtTasks.put("Tire", 0);
		builtTasks.put("Seat", 0);
		builtTasks.put("Frame", 0);

		// Car1
		tasks.add(new Engine(builtTasks));
		tasks.add(new Frame(builtTasks));
		tasks.add(new Seat(builtTasks));
		tasks.add(new Seat(builtTasks));
		tasks.add(new Tire(builtTasks));
		tasks.add(new Seat(builtTasks));
		tasks.add(new Tire(builtTasks));
		tasks.add(new Tire(builtTasks));
		tasks.add(new Seat(builtTasks));
		tasks.add(new Seat(builtTasks));
		tasks.add(new Tire(builtTasks));

		ExecutorService service = Executors.newFixedThreadPool(3);
		ArrayList<Future<?>> result = new ArrayList<Future<?>>();
		int i = 0;
		while(i<number){
			for (Runnable task : tasks) {
				result.add(service.submit(task));
			}
			i++;
		}
			
			for (Future<?> f : result) {
				try {
					f.get();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
			result.add(service.submit(new Car(builtTasks)));
			service.shutdown();

	}

	public static void buildCars(int time) {
		if (time > 0 && time <= 60) {
			Map<String, Integer> builtTasks = new HashMap<String, Integer>();
			builtTasks.put("Engine", 0);
			builtTasks.put("Tire", 0);
			builtTasks.put("Seat", 0);
			builtTasks.put("Frame", 0);

			ScheduledExecutorService scheduler = Executors
					.newScheduledThreadPool(3);
			final ScheduledFuture<?> engineHandle = scheduler
					.scheduleAtFixedRate(new Engine(builtTasks), 0, 1, SECONDS);
			final ScheduledFuture<?> frameHandle = scheduler
					.scheduleAtFixedRate(new Frame(builtTasks), 0, 1, SECONDS);
			final ScheduledFuture<?> seatHandle = scheduler
					.scheduleAtFixedRate(new Seat(builtTasks), 0, 1, SECONDS);
			final ScheduledFuture<?> tireHandle = scheduler
					.scheduleAtFixedRate(new Tire(builtTasks), 0, 1, SECONDS);
			final ScheduledFuture<?> carHandle = scheduler.scheduleAtFixedRate(
					new Car(builtTasks), 0, 1, SECONDS);

			scheduler.schedule(new Runnable() {
				@Override
				public void run() {
					engineHandle.cancel(true);
					frameHandle.cancel(true);
					seatHandle.cancel(true);
					tireHandle.cancel(true);
					carHandle.cancel(true);
				}
			}, time, SECONDS);

			try {
				Thread.sleep(time*1000);
				//System.out.println(builtTasks.toString());
				scheduler.shutdown();
			} catch (InterruptedException e) {
				// e.printStackTrace();
				return;
			}
		}
	}
}
