import java.util.*;
class min_array
{
	static void print_array(int[] arr)
	{
		System.out.println("Array elements are: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
	}
	static int min_no(int[] array)
	{
		int min=array[0];
		int temp;
		for (int i=1;i<array.length;i++)
		{
			if(array[i]<min)
			{
				temp=min;
				min=array[i];
				array[i]=temp;
				
			}
		}
		return min;
	}
	static void gen_array(int n)
	{
		Random r= new Random();
		int array[]= new int[n];
		for (int i=0;i<n;i++)
		{
			array[i]=r.nextInt(50);
		}
		print_array(array);
		System.out.println("Minimum number in array is :"+min_no(array));
	}
	public static void main(String args[])
	{
		long start=System.currentTimeMillis();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of digits in array: ");
		int n=sc.nextInt();
		gen_array(n);
		long stop=System.currentTimeMillis();
		double time=(stop-start)/1000.0;
		System.out.println("Time Taken: "+time);
	}
}