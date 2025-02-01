import java.util.*;
class three_divisors
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int count =0;
		for (int i=1;i<=num;i++)
		{
			if (num % i==0)
			{
				count+=1;
			}
		}
		if (count>=3)
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
	}
}