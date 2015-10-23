package maps;

import asciiPanel.AsciiPanel;
import engine.Engine;
import figures.Figure;

public class GrassTile extends Tile{
	
	private char icon;
	private int elapsedTime;
	
	public GrassTile() {
		super("Grass", (char)250, AsciiPanel.green, true);
		icon = (char)250;
		elapsedTime = 0;
	}

	@Override
	public void onEnter(Figure figure) {
		System.out.println("Shuffle Shuffle");
	}

	@Override
	public void onLeave(Figure figure) {
		System.out.println("Step Step");
	}

	@Override
	public void onStart() {
		
	}

	@Override
	public void onUpdate() {
		elapsedTime += Engine.deltaTime();
		if(elapsedTime >= Engine.SECONDS){
			elapsedTime -= Engine.SECONDS;
			
			if(this.isPathing()){
				this.toggleIcon(icon);
				System.out.println(this.getIcon());
			}
			else
				this.setIcon(icon);
		}
	}

	@Override
	public void onDestroy() {
		
	}

}
