import java.util.LinkedList;
import java.util.Scanner;


public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n,yoe,age;
		String name,qual;
		float sal;
		
		System.out.println("Enter the number of employees: ");
		n=Integer.parseInt(sc.nextLine());
		
		System.out.println("The number of employees: "+n);
		
		Employee e[] = new Employee[n]; //allocating space for an array of employee
		LinkedList<Employee> llemp = new LinkedList<Employee>();
		
		//Store in the array and add it to the collection
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of "+(i+1)+"Employee");
			System.out.println("Enter the name ");
			name=sc.nextLine();		
			
			System.out.println("Enter the age");
			age=Integer.parseInt(sc.nextLine());
						
			System.out.println("Enter the yoe");
			yoe=Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter the qualification");
			qual=sc.nextLine();
			
			System.out.println("Enter the salary");
			sal=Float.parseFloat(sc.nextLine());
			
			e[i] = new Employee(name,age,yoe,qual,sal);
			
			llemp.add(e[i]);
			
			for(Employee v : llemp)
			{
				if(v.yeo>5)
				{
					System.out.println("The details are: "+v);
				}
			}
			
		}
		sc.close();
	}

}
