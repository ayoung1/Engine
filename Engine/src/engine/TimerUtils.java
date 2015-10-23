package engine;

public abstract class TimerUtils {

	public TimerUtils(){
		Engine.addTimerUtil(this);
	}
	
	public void destroy(){
		Engine.removeTimerUtil(this);
	}
	
	public abstract void onStart();
	public abstract void onUpdate();
	public abstract void onDestroy();
}
