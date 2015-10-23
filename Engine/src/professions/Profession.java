package professions;

public abstract class Profession {
	private final int POINTS_PER_LEVEL = 100;
	
	private String name;
	private int level;
	private int power;
	private int agility;
	private int intelligence;
	private int vitality;
	
	public Profession(String _name, int _power, int _agility, int _intelligence, int _vitality){
		this.level = 1;
		this.name = _name;
		this.setAgility(_agility);
		this.setIntelligence(_intelligence);
		this.setPower(_power);
		this.setVitality(_vitality);
	}
	
	public void setPower(int _power){
		this.power = _power > 0?_power : 0;
	}
	
	public void setAgility(int _agility){
		this.agility = _agility > 0?_agility : 0;
	}
	
	public void setIntelligence(int _intelligence){
		this.intelligence = _intelligence > 0?_intelligence : 0;
	}
	
	public void setVitality(int _vitality){
		this.vitality = _vitality > 0?_vitality : 0;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPower(){
		return this.power;
	}
	
	public int getIntelligence(){
		return this.intelligence;
	}
	
	public int getAgility(){
		return this.agility;
	}
	
	public int getVitality(){
		return this.vitality;
	}
	
	public int getPointValue(){
		return level * POINTS_PER_LEVEL;
	}
	
	public abstract void setLevel(int _level);
}
