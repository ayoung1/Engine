package displays;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StartScreen implements Screen{

	private AsciiPanel terminal;
	
	@Override
	public void displayOutput(AsciiPanel terminal) {
		this.terminal = terminal;
		terminal.write("Start Screen", 1, 1);
		terminal.writeCenter("---Press Enter to Continue--", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return new WorldScreen(terminal);
	}

}
