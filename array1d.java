import java.util.*;
class array
{
	Random r=new Random();
	public void print(int[] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Array element is: "+arr[i]);
		}
		System.out.println("");
	}
	public void gen_array(int n)
	{
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=r.nextInt(50);
		}
		print(array);
	}
}
class array1d
{
	public static void main(String args[])
	{
		long start=System.currentTimeMillis();
		//System.out.println("Starting time is :"+start);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		array arr=new array();
		arr.gen_array(n);
		
		long stop=System.currentTimeMillis();
		double tym_taken = (stop-start)/1000.0;
		System.out.println("Time taken is"+ tym_taken);
	}
}