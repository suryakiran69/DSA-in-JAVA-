import java.util.*;
class stack_pra
{
	private listNode top;
	private int length;
	
	private class listNode
	{
		private int data;
		private listNode next;
		public listNode(int data)
		{
			this.data=data;
			//this.next=null;
		}
	}	
	public stack_pra()
	{
		top=null;
		length=0;
	}
	public int length ()
	{
		return length;
	}
	public boolean isEmpty()
	{
		return length==0;
	}
	public void push(int data)
	{
		listNode temp= new listNode(data);
		temp.next=top;
		top=temp;
		length+=1;
		System.out.println("The pushed data is "+data);
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			//return ;
		}
		else 
		{
			int a = top.data;
			top=top.next;
			length-=1;
			System.out.println("Poped data is: "+a);
		}
	}
	public static void main(String args[])
	{
		stack_pra stack= new stack_pra();
		stack.push(10);
		stack.push(9);
		stack.push(8);
		stack.push(7);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
}