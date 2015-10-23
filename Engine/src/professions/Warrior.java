package professions;

public class Warrior extends Profession{

	private final static String name 		= "Warrior";
	private final static int power 			= 16;
	private final static int agility 		= 11;
	private final static int intelligence	= 6;
	private final static int vitality 		= 14;
	
	private final int pow_level				= 0;
	private final int agi_level				= 0;
	private final int int_level				= 0;
	private final int vit_level				= 0;
	
	public Warrior() {
		super(name, power, agility, intelligence, vitality);
	}

	@Override
	public void setLevel(int _level) {
		this.setAgility(agility + _level * agi_level);
		this.setPower(power + _level * pow_level);
		this.setIntelligence(intelligence + _level * int_level);
		this.setVitality(vitality + _level * vit_level);
	}

}
