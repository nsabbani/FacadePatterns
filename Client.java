import java.io.ObjectInputStream.GetField;

public class Client {
	
	public static void main (String []args)
	{
		FacadeWindow obj = FacadeWindow.getInstance();
		System.out.println(obj.getClosedWindow());
		System.out.println(obj.getSlideAbleWindow());
		System.out.println(obj.getDoorBasedWindow());
	}

}
