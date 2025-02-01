import java.util.*;
class rev_string 
{
	public static void main(String args[])
	{
		Stack<Character> stack = new Stack<>();
		String s= "surya";
		char[] array=s.toCharArray();
		for (char c:array)
			stack.push(c);
		
		for (int i=0;i<array.length;i++){
			array[i]=stack.pop();
		    System.out.print(array[i]);
		}
		
	}
}