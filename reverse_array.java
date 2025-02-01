import java.util.*;
class reverse_array
{
	int temp=0;
	static void gen_array(int n)
	{
		Random r= new Random();
		int[] array=new int[n];
		for (int i=0;i<n;i++)
		{
			array[i]=r.nextInt(30);
		}
		reverse(array);
	}
	static void reverse(int[] array)
	{
		int temp=0;
		System.out.println("Orignal Array");
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for (int i=0;i<array.length/2;i++)
		{
			temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		System.out.println("Reversed array is :");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String args[])
	{
		long start=System.currentTimeMillis();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		gen_array(n);
		long stop=System.currentTimeMillis();
		double time=(stop-start)/1000.0;
		System.out.println("");
		System.out.printf("Time taken is %.3f",time);
	}
}