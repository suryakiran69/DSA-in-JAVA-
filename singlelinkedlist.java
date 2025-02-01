class singlelinkedlist
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
		singlelinkedlist sll = new singlelinkedlist();
		sll.head = new listNode(10);
		listNode second = new listNode(8);
		listNode third = new listNode(1);
		listNode fourth = new listNode(9);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
	    listNode current = head;
		while( current.next!= null)
		{
			System.out.println("Data is "+ current.data);
			current=current.next;
		}
		System.out.println("Data is "+ current.data);
		System.out.println("Exchanging the data");
		sll.head.next=third;
		third.next=second;
		second.next=fourth;
		current=head;
		while( current.next!= null)
		{
			System.out.println("Data is "+ current.data);
			current=current.next;
		}
		System.out.println("Data is "+ current.data);
	}
}