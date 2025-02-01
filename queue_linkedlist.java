class queue_linkedlist
{
	private listNode front,rear;
	int size=0;
	private class listNode
	{
		private int data;
		private listNode next;
		public listNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}	
	//listNode rear = front;
	public queue_linkedlist()
	{
		front=rear=null;
		//front.data=null;
	}
	public void enqueue(int data)
	{
		listNode temp = new listNode(data);
		if(front==null)
		{
			front=rear=temp;
		}
		else 
		{
			rear.next=temp;
			rear=temp;
		}
		size+=1;
		System.out.println("Enqueued element is: "+data);
	}
	public void dequeue()
	{
		if(size==0)
		{
			System.out.println("No Queue");
		}
		else {
		int data=front.data;
		front=front.next;
		size-=1;
		System.out.println("Dequeued element is: "+data);
		}
	}
	public void show()
	{
		if(size==0)
			System.out.println("there is no Queue");
		else {
		System.out.println("The elements are: ");
		listNode temp=front;
		while(temp!= null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println();
		}
	}
	public static void main(String args[])
	{
		queue_linkedlist q= new queue_linkedlist();
		q.show();
		q.dequeue();
		q.enqueue(10);
		q.enqueue(9);
		q.enqueue(8);
		q.show();
		q.dequeue();
		q.enqueue(7);
		q.show();
		q.dequeue();
	}
}