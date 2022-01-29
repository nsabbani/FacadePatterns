public class DoorBasedWindow implements Window {
 
private static DoorBasedWindow doorBasedWindow;
    
    DoorBasedWindow() {}
 
    public static synchronized DoorBasedWindow getInstance()
    {
        if (doorBasedWindow==null)
            doorBasedWindow = new DoorBasedWindow();
        return doorBasedWindow;
    }
    @Override
    public String installWindow()
    {
        return "Installing a door based window.";
    }

}