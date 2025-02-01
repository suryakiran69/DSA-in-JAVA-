class singlelinked
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
		singlelinked sll = new singlelinked();
		sll.head=new listNode(10);
		listNode second = new listNode(9);
		listNode third = new listNode (8);
		listNode fourth = new listNode (7);
		sll.head.next= second;
		second.next=third;
		third.next=fourth;
	}
}