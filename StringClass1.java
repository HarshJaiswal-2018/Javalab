import java.util.Scanner;

public class StringClass1
{
	public static void main(String[] args)
	{

		String st;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		st=sc.nextLine();

		System.out.println("Enter the number n ");
		int n = sc.nextInt();
		System.out.println("Enter the number m ");
		int m = sc.nextInt();

		String st1 = st.substring(n, n+m);
		System.out.println("The extracted string is "+st1);
		System.out.println("enter the string to be searched ");
		st1 = sc.next();
		int count = 0;
		int idx = 0;

		while ((idx = st.indexOf(st1, idx)) != -1)
		{
			idx++;
			count++;
		}

		System.out.println("Count of "+ st1 +" is "+count);
		System.out.println("enter the string to be replaced ");
		st1 = sc.next();
		String stt = st.replaceAll(st1, "hello");
		System.out.println(stt +" is the string after replacement");
		char[] charArray = st.toCharArray();
		int length = charArray.length;

		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length-1;j++)
			{
				if (charArray[j] < charArray[i])
				{
					char temp = charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=temp;
				}
			}
		}

		st1 = String.valueOf(charArray);

		String st3 = new String("Hello");
		System.out.println("The sorted string is "+st1);
		// Compare two strings
		System.out.println("Enter the string to be compared ");
		sc.nextLine();
		String st2 = sc.nextLine();

		System.out.println("Enter the string to be Concatenate ");
		String st4 = sc.nextLine();
		int p = st.compareTo(st2);
		if(p==0)
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are unequal");
		}

		//System.out.println("The result of comparison "+p);
		String st5=st.concat(st4);

		System.out.println("Concatenated string is: "+st5);

		sc.close();

	}
}
