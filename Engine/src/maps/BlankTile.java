package maps;

import asciiPanel.AsciiPanel;
import figures.Figure;

public class BlankTile extends Tile{
	public BlankTile() {
		super(" ", ' ', AsciiPanel.black, false);
	}

	@Override
	public void onEnter(Figure figure) {}

	@Override
	public void onLeave(Figure figure) {}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		
	}

}
