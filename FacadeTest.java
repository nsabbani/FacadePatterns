import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacadeTest {

	@Test
	void closedWindowFacadeTest() {
		FacadeWindow obj = FacadeWindow.getInstance();
		assertEquals("Installing a closed window.", obj.getClosedWindow());
	}
	
	@Test
	void slideAbleWindowFacadeTest() {
		FacadeWindow obj = FacadeWindow.getInstance();
		assertEquals("Installing a slidable window.", obj.getSlideAbleWindow());
	}
	
	@Test
	void doorBasedWindowFacadeTest() {
		FacadeWindow obj = FacadeWindow.getInstance();
		assertEquals("Installing a door based window.", obj.getDoorBasedWindow());
	}

}
