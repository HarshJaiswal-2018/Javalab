
//public class MyTwoWheeler {
//
//}
class MyTwoWheeler extends TwoWheeler
{
	String OwnerName;
	MyTwoWheeler(String ow,String br, int co, String et, String colo)
	{
		OwnerName = ow;
		super.brand=br;
		super.cost = co;
		super.EngineType = et;
		super.color = colo;
	}
	public void prin()
	{
		System.out.println("The Vehicle \nBrand: "+super.brand+ "\nEngineType: " +super.EngineType + "\nCost: " + super.cost + "\nColor: "+ super.color);
		System.out.println("Owner: " + OwnerName);
	}
}