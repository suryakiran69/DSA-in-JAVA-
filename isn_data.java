import java.util.*;
class isn_data
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
		isn_data sll=new isn_data();
		sll.head = new listNode(10);
		listNode second = new listNode(9);
		listNode third = new listNode(8);
		listNode fourth = new listNode(5);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		int count=0;
	    listNode current = head;
		while (current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
			count++;
		}
		System.out.println("");
		System.out.println("New data: ");
		int new_data=sc.nextInt();
		System.out.println("Position: ");
		int position = sc.nextInt();
		int pos=0;
		//current.data(new_data);
		listNode newNode=new listNode(new_data);
		listNode temp = head ;
		//listNode pervious;
		//listNode first=head;
		if(position==0){
			newNode.next=head;
		    head=newNode;
		}
		else if (position!=0&&position<=count)
		{
			while(temp!=null)
			{
				pos++;
				if(pos==position)
				{
					newNode.next=temp.next;
					temp.next=newNode;
				}
				temp=temp.next;
			}
		}
		else {
			System.out.println("Invaild Input");
			System.exit(0);
		}
		System.out.println("");
		current=head;
		
		while (current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
		}
	}
}