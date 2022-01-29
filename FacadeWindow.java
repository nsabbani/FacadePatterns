public class FacadeWindow
{
	private static FacadeWindow facadeWindow = null;
	 public static synchronized FacadeWindow getInstance()
	    {
	        if (facadeWindow==null)
	        	facadeWindow = new FacadeWindow();
	        return facadeWindow;
	    }
    public String getSlideAbleWindow()
    {
        SlidableWindow s = new SlidableWindow();
        String slideableWindow = (String)s.installWindow();
        return slideableWindow;
    }
      
    public String getDoorBasedWindow()
    {
        DoorBasedWindow d = new DoorBasedWindow();
        String doorBasedWindow = (String)d.installWindow();
        return doorBasedWindow;
    }
      
    public String getClosedWindow()
    {
    	ClosedWindow c = new ClosedWindow();
        String closedWindow = (String)c.installWindow();
        return closedWindow;
    }    
}