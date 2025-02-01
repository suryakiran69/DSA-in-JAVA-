import java.util.*;
class missing_number
{
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		int[] array={1,2,4,6,7,8,9,10,12,13,15,16,17,18,19,20};
		for(int i=a;i<b;i++)
		{
			temp=0;
			//System.out.println("Checking for "+i);
			for(int j=0;j<array.length;j++)
			{
				if(i==array[j])
				{
					//System.out.println("Checked for "+i);
					temp=1;
				}
			}
			//System.out.println("Temp value for "+i+" is "+temp);
			if(temp==0)
			{
				System.out.println("Missing number is :"+i);
			}
		}
    }
}