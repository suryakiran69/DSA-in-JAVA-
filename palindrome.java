import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] check=s.toCharArray();
		int h=0;
		for (int i=0;i< check.length/2;i++)
		{
			
			if(check[i]==check[check.length-1-i])
				h++;
			
		}
		if (h==check.length/2)
			System.out.println("Given String is palindrome ");
		else 
			System.out.println("Given String is not palindrome ");
	}
}