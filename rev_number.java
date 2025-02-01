import java.util.*;
class rev_number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int digit=0;
		int copy = a;
		while (copy != 0)
		{
			digit = copy % 10;
			b = b *10 + digit ;
			copy /=10;
		}
		System.out.println("Reverse number is :" +b);
	}
}