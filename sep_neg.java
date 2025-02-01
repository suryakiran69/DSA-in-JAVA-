import java.util.*;
class sep_neg
{
	public static void gen_array(int n)
	{
		int x=0;
		Random r=new Random();
		int[] array=new int[n];
		for (int i=0;i<n;i++)
		{
			x=r.nextInt(200);
			x=x-100;
			array[i]=x;
		}
		System.out.println("New array is :");
		for (int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("");

		arrange(array);
	}
	public static void  arrange(int[] array)
	{
		int j=0;
		int n=array.length;
		int[] arr = new int[n];
		for (int i=0;i<n;i++)
		{
			if(array[i] >= 0)
			{
				arr[j]=array[i];
				j++;
			}
		}
		for (int i=0;i<n;i++)
		{
			if(array[i]<0)
			{
				arr[j]=array[i];
				j++;
			}
		}
		System.out.println("New Array is :");
		for (int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		gen_array(n);
		//int[] array=new array[n];
	}
}