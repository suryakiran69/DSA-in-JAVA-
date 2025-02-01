import java.util.*;
class rev_ll
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
		rev_ll sll=new rev_ll();
		sll.head=new listNode(10);
		listNode second = new listNode(9);
		listNode third = new listNode(8);
		listNode fourth = new listNode(3);
		
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		
		listNode current = head;
		
		System.out.println("Current Data is :");
		while (current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
		
		current =  head;
		listNode previous=null;
		listNode next=current.next;
		System.out.println("");
		System.out.println("Variable Nodes Created");
		
		while(current!=null)
		{
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		System.out.println("Replaced");
		listNode temp=previous;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		
	}
}