import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CommandTest {

	@Test
	void slideableWindowTest() {
		CommandWindow cw = new CommandWindow();
		cw.setCommand(SlidableWindow.getInstance());
		assertEquals("Installing a slidable window.", cw.buttonWasPressed());
		
	}
	
	@Test
	void closedWindowTest() {
		CommandWindow cw = new CommandWindow();
		cw.setCommand(ClosedWindow.getInstance());
		assertEquals("Installing a closed window.", cw.buttonWasPressed());
		
	}
	
	@Test
	void doorBasedWindowTest() {
		CommandWindow cw = new CommandWindow();
		cw.setCommand(DoorBasedWindow.getInstance());
		assertEquals("Installing a door based window.", cw.buttonWasPressed());
		
	}

}
