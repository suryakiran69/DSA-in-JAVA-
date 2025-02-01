import java.util.*;
class magic_square
{
	static int add(int a,int dim)
	{
		if (a==dim)
			return 1;
		else 
			return a+=1;
	}
	static int sub (int a,int dim)
	{
		if (a==1)
			return dim;
		else 
			return a-=1;
	}
	
	public static void main(String args[])
	{
		int sum =0 ;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Dimmensions: ");
		int dim = sc.nextInt();
		System.out.println("");
		int [][] magic = new int [dim][dim];
		int row_ind=0;
		int col_ind=(dim/2)+1;
		int num=12;
		int temp=num;
		for (int i=0;i<dim;i++)
		{
			row_ind=add(row_ind,dim);
			magic[row_ind-1][col_ind-1]=num;
			num +=1;
			for (int j=0;j<dim-1;j++)
			{
				row_ind=sub(row_ind,dim);
				col_ind=add(col_ind,dim);
				magic[row_ind-1][col_ind-1]=num;
				num +=1;
			}
		}
		
		// Finding the sum value using Starting value and Dimensions.
		int SumOfNumbers=((dim-2)*(dim-1))/2;
		System.out.println("SumOfNumbers: "+SumOfNumbers);
		sum = ((temp)*(dim))+((dim+2)*(SumOfNumbers))+(dim-1)+(((dim+2)*(dim-1))/2);
		
		System.out.println("Sum is "+sum);
		System.out.println("");
		for (int i=0;i<dim;i++)
		{
			for (int j=0;j<dim;j++)
			{
				System.out.print(magic[i][j]+" ");
			}
			System.out.println("");
		}
	}
}