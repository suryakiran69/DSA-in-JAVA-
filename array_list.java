import java.util.*;
class array_list
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<>();
		
		list.add("9");
		list.add("8");
		list.add("6");
		
		for (int i=0;i<list.size();i++)
		{
			System.out.println("Element is "+list.get(i));
		}
	}
}