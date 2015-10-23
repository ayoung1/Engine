package engine;

import java.util.concurrent.LinkedBlockingQueue;

public class Engine extends Thread{
	
	public static final long SECONDS = 1000L;
	
	private static Engine engine;
	
	private LinkedBlockingQueue<TimerUtils> instantiated;
	private LinkedBlockingQueue<TimerUtils> toRemove;
	private long deltaTime;
	private long elapsedTime;
	private long currentTime;
	
	public void run(){
		long prevTime = System.currentTimeMillis();
		
		while(true){
			currentTime = System.currentTimeMillis();
			deltaTime = currentTime - prevTime;
			prevTime = currentTime;
			elapsedTime += deltaTime;
			
			engine.onUpdate();
		}
	}
	
	private Engine(){
		instantiated = new LinkedBlockingQueue<TimerUtils>();
		toRemove = new LinkedBlockingQueue<TimerUtils>();
		
		this.start();
	}
	
	private void onUpdate(){
		if(instantiated.isEmpty())
			return;
		
		for(TimerUtils utils : instantiated)
			utils.onUpdate();
		for(TimerUtils utils : toRemove){
			instantiated.remove(utils);
			utils.onDestroy();
		}
		toRemove.clear();
	}
	
	public static Engine instanceOf(){
		if(engine == null)
			engine = new Engine();
		return engine;
	}
	
	public static void addTimerUtil(TimerUtils utils){
		instanceOf().instantiated.add(utils);
	}
	
	public static void removeTimerUtil(TimerUtils utils){
		instanceOf().toRemove.add(utils);
	}
	
	public static long deltaTime(){
		return instanceOf().deltaTime;
	}
}
