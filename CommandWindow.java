class CommandWindow
{
	Window command = null;
  
    public CommandWindow()
    {
    }
  
    public void setCommand(SlidableWindow sWindow)
    {
        command = sWindow;
    }
    public void setCommand(DoorBasedWindow dWindow)
    {
        command = dWindow;
    }
    public void setCommand(ClosedWindow cWindow)
    {
        command = cWindow;
    }
  
    public String buttonWasPressed()
    {
        return command.installWindow();
    }
}