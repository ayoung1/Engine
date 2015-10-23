package maps;

import java.awt.Color;

import engine.TimerUtils;
import figures.Figure;

public abstract class Tile extends TimerUtils {
	private String name;
	private char icon;
	private Color color;
	private boolean isPathing;
	private boolean pathable;
	
	private final char pathingIcon = '+';
	
	public Tile(String _name, char _icon, Color _color, boolean _pathable){
		super();
		name = _name;
		icon = _icon;
		color = _color;
		pathable = _pathable;
		isPathing = false;
	}
	
	public String getName(){
		return name;
	}
	
	public void setIcon(char _icon){
		icon = _icon;
	}
	
	public char getIcon(){
		return icon;
	}
	
	public Color getColor(){
		return color;
	}
	
	public boolean isPathable(){
		return pathable;
	}
	
	public boolean isPathing(){
		return isPathing;
	}
	
	public void togglePathIndicator(){
		isPathing = isPathing ? false : true;
	}
	
	public void toggleIcon(char _icon){
		icon = icon == _icon ? pathingIcon : _icon;
	}
	
	public abstract void onEnter(Figure figure);
	public abstract void onLeave(Figure figure);
}
