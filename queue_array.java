class queue_array
{
	int[] queue = new int[50];
	int size=0;
	int front=0;
	int rear=0;
	public void enqueue(int data)
	{
		queue[rear]=data;
		rear+=1;
		size +=1;
		System.out.println("Enqueued element is: "+data);
	}
	public void dequeue()
	{
		if (size==0)
			System.out.println("There is no Queue");
		else{
		int data = queue[front];
		front+=1;
		size-=1;
		System.out.println("Dequeued element is: "+data);
		}
	}
	public void show()
	{
		if (size ==0)
		{
			System.out.println("There is no Queue");
		}
		else{
		System.out.println("The Elements are :");
		for(int i=front;i<size+front;i++)
		{
			System.out.print(queue[i]+"-->");
		}}
	}
	public static void main(String args[])
	{
		queue_array q=new queue_array();
		q.dequeue();
		q.show();
		q.enqueue(10);
		q.enqueue(9);
		q.dequeue();
		q.enqueue(8);
		q.enqueue(7);
		q.show();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}
}