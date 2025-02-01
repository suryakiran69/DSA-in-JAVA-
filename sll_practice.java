class sll_practice
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
		int cout=0;
		sll_practice sll=new sll_practice();
		sll.head = new listNode(10);
		listNode second = new listNode(9);
		listNode third = new listNode(8);
		listNode fourth = new listNode(1);
		sll.head.next=second;
		second.next=third;
		third.next=fourth;
		listNode current=head;
		while (current!=null)
		{
			System.out.print(current.data+"-->");
			current=current.next;
			cout++;
		}
		System.out.println("");
		System.out.println("Length of the linkedlist: "+ cout);
	}
	
}