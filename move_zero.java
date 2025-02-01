import java.util.*;
class move_zero
{
	static void mv_ze(int[] array)
	{
		System.out.println("Original array is: ");
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("");
		int j=0;
		int temp=0;
		for (int i=0;i<array.length;i++)
		{
			if(array[i]!=0 && array[j]==0)
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			if(array[j]!=0)
			{
				j++;
			}
		}
		System.out.println("Updated array is: ");
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[] array=new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("Enter the digit: ");
			array[i]=sc.nextInt();
		}
		mv_ze(array);
    }
}