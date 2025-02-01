/*
    BIGG O NOTATION:
	Upper bound algoritm 
	
	Rules :
	1.It's a single processor.
	2.Sequential execution of statements.
	3.Assignments, Return, Arthimetic, Logical, Small/Single operations takes ONE unit of time .
	4.Drop lower order terms.
	5.Drop constant multipliers.
		Eg.: if expression is 3x^2+6x+1 the Bigg O Notation for this is 0(n^2).
		
    code:
		public int sum (int a,int b)
		{
			int sum=a+b;
			return sum;
		}
		
	Line 16: Takes 4 operations, 2 accesing a and b, Arthimetic operation(3th), assigning value to sum.
	Line 17: Takes 2 operations, 1 is accesing the sum value and return the value is 1. Total is 2.

*/





class tcBiggO
{
	public static void main(String[] args)
    {
        
    }
}