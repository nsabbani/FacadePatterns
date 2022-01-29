public class ClosedWindow implements Window {
 
private static ClosedWindow closedWindow;
    
    ClosedWindow() {}
 
    public static synchronized ClosedWindow getInstance()
    {
        if (closedWindow==null)
            closedWindow = new ClosedWindow();
        return closedWindow;
    }
    @Override
    public String installWindow()
    {
        return "Installing a closed window.";
    }

}