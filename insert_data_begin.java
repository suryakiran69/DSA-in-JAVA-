import java.util.*;
class insert_data_begin
{
	private static	listNode head;
	
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
		Scanner sc= new Scanner(System.in);
		insert_data_begin sll=new insert_data_begin();
		sll.head = new listNode(10);
		listNode second = new listNode(9);
		listNode third = new listNode(8);
		listNode fourth = new listNode(5);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
	    listNode current = head;
		while (current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("");
		System.out.println("Enter the data inserted at begin :");
		int a=sc.nextInt();
		listNode begin = new listNode(a);
		begin.next=head;
		current=begin;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;			
		}
		System.out.println("");
		System.out.println("Enter the data inserted at end :");
		int b=sc.nextInt();
		listNode end = new listNode(b);
		fourth.next=end;
		current=begin;
		while(current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;			
		}
		
		
		
		
		
		
		
	}
}