
//public class TwoWheeler {
//
//}
import java.util.Scanner;
class TwoWheeler extends Vehicle
{
	protected String brand;
	protected int cost;
	String EngineType;
	public String color;
	Scanner s;
	public void getData()
	{
		s = new Scanner(System.in);
		System.out.println("Enter Brand of TwoWheeler: ");
		brand=s.next();
		System.out.println("Enter Cost of TwoWheeler ");
		cost = Integer.parseInt(s.next());
		System.out.println("Enter Engine Type TwoWheeler (2_Stroke or 4_ Stroke) ");
		EngineType = s.next();
		System.out.println("Enter Color of TwoWheeler ");
		color = s.next();
	}
	public void putData()
	{
		System.out.println("TWO WHEELER\nBrand: "+ brand + "\nEngineType: "+ EngineType + " \nCost: " + cost + "\nColor: " + color+"\n");
	}
}