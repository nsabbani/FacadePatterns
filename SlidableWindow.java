public class SlidableWindow implements Window {
 
	
private static SlidableWindow window;
    
    SlidableWindow() {}
 
    public static synchronized SlidableWindow getInstance()
    {
        if (window==null)
            window = new SlidableWindow();
        return window;
    }
    @Override
    public String installWindow()
    {
        return "Installing a slidable window.";
    }
    
    
}