import java.util.*;
class sep_neg_v2 
{
	public static void main(String args[])
	{
		Random r = new Random();
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] array=new int [n];
		for (int i=0;i<n;i++)
		{
			//int x=r.nextInt(200)-100;
			array[i]=r.nextInt(200)-100;
		}
		System.out.println("Original elements are :");
		for (int i=0;i<n;i++)
		{
			System.out.print(array[i]+ " ");
		}
		System.out.println("");
		//int n=array.length;
		int wf=0;
		int pf=0;
		int temp;
		for (wf=0;wf<n;wf++)
		{
			pf=wf;
			while (pf<n && array[pf]<0)
			{
				pf++;
			}
			if (pf == n)
				break;
			if (pf != wf)
			{	temp = array [pf];
				for (int shifter = pf-1;shifter >= wf ; shifter --)
				{
					array[shifter+1]=array[shifter];
				}
				array[wf]=temp;
			}
		}
		System.out.println("After modification :");
		for (int i=0;i<n;i++)
		{
			System.out.print(array[i]+ " ");
		}
	}
}