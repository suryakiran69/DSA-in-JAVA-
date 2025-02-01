class sum_of_digits
{
	public static void main(String args[])
	{
		int num =38;
		int sum=0;
		while (num != 0){
            sum = sum+(num %10);
            num = num/10;
        }
		System.out.println("Sum after first loop "+sum);
        while (sum /10 !=0){
            num =sum ;
            sum =0;
            while (num != 0){
            sum += num %10;
            num = num/10;
        }
        }
		System.out.println("Sum is "+sum);
	}
}