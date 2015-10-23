package displays;

import java.awt.event.KeyEvent;

import engine.TimerUtils;
import maps.Map;
import asciiPanel.AsciiPanel;

public class WorldScreen extends TimerUtils implements Screen {

	private Map world;
	private int wHeight;
	private int wWidth;
	private AsciiPanel terminal;
	
	public WorldScreen(AsciiPanel _terminal){
		super();
		terminal = _terminal;
		world = new Map(15,30);
		
		world.getTile(10, 15).togglePathIndicator();
		
		wHeight = 21;
		wWidth = 80;
	}
	
	public int getScrollY() {
	    return Math.max(0, Math.min(5 - wWidth / 2, world.getWidth() - wWidth));
	}
	
	public int getScrollX() {
	    return Math.max(0, Math.min(5 - wHeight / 2, world.getHeight() - wHeight));
	}
	
	@Override
	public void displayOutput(AsciiPanel _terminal) {
		updateMap();
	}

	private void updateMap(){
		int left = getScrollX();
		int top = getScrollY();
		
		for (int x = 0; x < wHeight; x++){
	        for (int y = 0; y < wWidth; y++){
	        	int wx = x + top;
	            int wy = y + left;
	            
	            terminal.write(world.getTile(wx, wy).getIcon(), y, x, world.getTile(wx, wy).getColor());
	        }
	    }
	}
	
	@Override
	public Screen respondToUserInput(KeyEvent key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onStart() {}

	@Override
	public void onUpdate() {
		terminal.clear();
		updateMap();
	}

	@Override
	public void onDestroy() {}

}
