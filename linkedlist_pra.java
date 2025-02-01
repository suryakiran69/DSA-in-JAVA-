class linkedlist_pra
{
	private static listNode head;
	private static class listNode
	{
		private int data;
		private listNode next ;
		public listNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String args[])
	{
		linkedlist_pra sll=new linkedlist_pra();
		sll.head = new listNode(10);
		listNode second = new listNode(9);
		listNode third = new listNode(8);
		listNode fourth = new listNode (7);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		listNode temp = head;
		while (temp != null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
	}
}