
//public final class FourWheeler {
//
//}
import java.util.Scanner;
final class FourWheeler extends Vehicle
{
	private String brand;
	protected int cost;
	
	String EngineType;
	public String color;
	Scanner s;
	public void getData()
	{
		s = new Scanner(System.in);
		System.out.println("Enter Brand of FourWheeler: ");
		brand=s.next();
		System.out.println("Enter Cost of FourWheeler ");
		cost = Integer.parseInt(s.next());
		System.out.println("Enter Engine Type of FourWheeler (2_Stroke or 4_Stroke) ");

		EngineType = s.next();
		System.out.println("Enter Color of FourWheeler ");
		color = s.next();
	}
	public void putData()
	{
		System.out.println("FOUR WHEELER\nBrand:" + brand + "\nEngineType: "	+ EngineType + "\nCost: " + cost + "\nColor: " + color+"\n");
	}
}