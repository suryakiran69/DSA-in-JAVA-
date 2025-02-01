class stack_1
{
	private listNode top;
	private int length;
	
	private class listNode{
		private int data;
		private listNode next;
		public listNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public stack_1(){
		top=null;
		length=0;
	}
	public int length(){
		return length;
	}
	public boolean isEmpty (){return length==0;}
	
	public void push (int data)
	{
		listNode temp = new listNode(data);
		temp.next=top;
		top=temp;
		length+=1;
	}
	public int pop()
	{
		if(isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}
		else {
		int result= top.data;
		top=top.next;
		length--;
		return result;}
		
		
	}
	public void peek(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Data is "+top.data);
	}
	
	
	public static void main(String args[])
	{
		stack_1 stack= new stack_1();
		stack.peek();
		stack.push(10);
		stack.push(9);
		stack.push(8);
		stack.peek();
		System.out.println("stack poped is "+stack.pop());
		//stack.peek();
		System.out.println("stack poped is "+stack.pop());
		stack.peek();
		System.out.println("stack poped is "+stack.pop());
		stack.peek();
	}
}