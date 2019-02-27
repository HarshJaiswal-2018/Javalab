import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapCollection 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n,id,credit;
		System.out.println("Enter the number of employees");
		n=Integer.parseInt(sc.nextLine());
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter the id of the employee ");
			id=sc.nextInt();
			
			System.out.println("Enter the credits ");
			credit=sc.nextInt();
			
			hm.put(id, credit);			
		}
		
		Set<Map.Entry<Integer,Integer>>	 set = hm.entrySet();
		
		for(Map.Entry<Integer,Integer> me : set)
		{
			if(me.getKey()>=105 && me.getKey()<=120)
			{
				hm.put(me.getKey(),me.getValue()+20);
			}
			else if(me.getKey()>=125 && me.getKey()<=200)
			{
				hm.put(me.getKey(),me.getValue()+30);
			}
			
			//System.out.println("For customer Id: "+me.getKey()+" the number of credit points are: "+me.getValue());
		}
		
		for (Map.Entry<Integer,Integer> me : set)
		{
			System.out.println("For customer Id: "+me.getKey()+" the number of credit points are: "+me.getValue());
		}
		
	}

}
