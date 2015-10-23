package figures;

public abstract class Energy {
	private String name;
	private int max;
	private int current;
	
	public Energy(String _name, int _max){
		name = _name;
		max = _max;
		current = _max;
	}
	
	public abstract void increase(int amount);
	public abstract void decrease(int amount);
	public abstract void onTurnStart();
	
}