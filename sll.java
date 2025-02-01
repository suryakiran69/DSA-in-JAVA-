class sll
{
	private static ln head;
	
	private static class ln 
	{
		private int data;
		private ln next;
		public ln (int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static void main(String args[])
	{
		sll lnl= new sll();
		lnl.head=new ln(10);
		ln second = new ln(9);
		ln third = new ln(8);
		ln fourth = new ln(1);
		lnl.head.next=second;
		second.next=third;
		third.next=fourth;
		ln current = head;
		while(current != null)
		{
			System.out.println("Data is "+current.data);
			current=current.next;
		}
		//System.out.println("Data is "+current.data);
	}
}