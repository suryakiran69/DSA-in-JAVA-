import java.util.*;
class sort_ll
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
	public static void print()
	{
		listNode temp = head;
		//temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void sort (int n)
	{
		listNode present = head;
		listNode after = head.next;
		int tem;
		for (int j=0;j<n;j++){
			present=head;
		    after = head.next;
		for (int i=0;i<n-1;i++)
		{
			if (present.data>after.data)
			{
				tem=present.data;
				present.data=after.data;
				after.data=tem;
			}
			present=present.next;
			after=after.next;
		}}
	}
	public static void main(String args[])
	{
		sort_ll sll=new sort_ll();
		sll.head = new listNode(1);
		listNode second = new listNode(0);
		listNode third = new listNode(88);
		listNode fourth = new listNode(7);
		sll.head.next= second;
		second.next=third;
		third.next=fourth;
		System.out.println("Before sort");
		print();
		sort (4);
		System.out.println("After sort");
		print();
	}
}