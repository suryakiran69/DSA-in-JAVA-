import java.util.*;
class use_ll_class1 
{
	public static void main(String args[])
	{
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(9);
		list.add(8);
		System.out.println("LinkedList is "+list);
		//System.out.println("LinkedList is "+list);
		//list.display();
		list.remove (1);
		System.out.println("LinkedList is "+list);
		list.add(2);
		System.out.println("LinkedList is "+list);
		
		
	}
}