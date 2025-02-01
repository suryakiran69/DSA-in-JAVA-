import java.util.*;
class rem_ll
{
	private static listNode head;
	
	private static class listNode
	{
		private int data;
		private listNode next;
		
		public listNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String args[])
	{
		try {
		Scanner sc=new Scanner (System.in);
		rem_ll sll=new rem_ll();
		sll.head=new listNode(10);
		listNode second = new listNode(9);
		listNode third = new listNode(7);
		listNode fourth = new listNode(7);
		listNode fifth = new listNode(6);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		listNode current=head;
		System.out.println("");
		System.out.println("List Before Eleminating: ");
		System.out.println("");
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("");
		System.out.println("");
		System.out.print("Enter the element to remove: ");
		int a=sc.nextInt();
		System.out.println("");
		current=head.next;
		listNode previous = head;
		listNode temp=null;
		if (head.data==a)
			head=head.next;
		while(current!=null)
		{
			if(current.data != a)
			{
				temp=current;
				current=current.next;
			}
			else if (current.data == a)
			{
				temp.next=current.next;
				current=current.next;
				
				
			}
		}
		current=head;
		System.out.println("List after removing Element: ");
		System.out.println("");
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Invaild Inputs Try again");
		}
	}
}