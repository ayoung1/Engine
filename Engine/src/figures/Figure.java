package figures;

import professions.Profession;

public class Figure {
	private Profession profession;
	
	private String name;	public String getName(){return this.name;}
	private Energy health;
	private Energy mana;
	
	public Figure(String _name, Profession _profession, int _level){
		if(_profession == null)
			System.exit(-1);
		_level = _level > 0 ? _level : 1;
		
		this.name = _name;
		this.profession = _profession;
		this.profession.setLevel(_level);
	}
	
	public Profession getProfession(){
		return this.profession;
	}
}
