
public class Employee
{
	String name;
	int age,yeo;
	String qual;
	float sal;
	
	public Employee(String name, int age, int yeo, String qual, float sal)
	{
		super();
		this.name = name;
		this.age = age;
		this.yeo = yeo;
		this.qual = qual;
		this.sal = sal;
	}

	@Override
	public String toString() 
	{
		return "Employee [name=" + name + ", age=" + age + ", yeo=" + yeo + ", qual=" + qual + ", sal=" + sal + "]";
	}
	
}
