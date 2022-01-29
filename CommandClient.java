
public class CommandClient {
	
	public static void main (String []args)
	{
		CommandWindow cw = new CommandWindow();
		cw.setCommand(SlidableWindow.getInstance());
		cw.buttonWasPressed();
		cw.setCommand(ClosedWindow.getInstance());
		cw.buttonWasPressed();
		cw.setCommand(DoorBasedWindow.getInstance());
		cw.buttonWasPressed();
		
	}

}
