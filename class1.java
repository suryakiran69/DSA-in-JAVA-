/*
CLASS - 1:
 DATA STRUCTURE 
 Linear     -     Array, linkedlist, stack, queue.
 Non-Linear -     Tree, Graph.
 
 ALOGORITHMS 
 *Step by by step process to slove a problem.
 
 Time complexity and space complexity
 
 Asymptotic analysis :
 * Helps us to evaluating the performance of an algoritm when the inputs are large number.
 * How time and space complexity are taken by algoritm when inputs are increase in size.
 
 Asymptotic Notations:
 *Asymptotic Notations are the maathematical tools are used to describe the running time of the algorithm in terms of input size.
  Eg:
  --> We are having a car which give the mailage (Output) as Highway(i/p-1) as 25km/l, City(i/p-2) as 15km/l. Like that based on 
      size output will be deicded.
  Types of Asymptoic notations:
	1.Omega Notation: It is the formal way to express the lower bound of an algorithm running time.(Best case analysis).
		* Lower bound means-->if an algoritm takes 100secs to complte then the lower bound is 100 sec. It takes more than 100 sec but
		not less than 100sec.
	2.Big O(o) Notation: It is the formal way to express the upper bound of the algorithm running time.(Worst case analysis).
	3.Theta Notation: It is the formal way to express the both upper and lower bound of algoritm.
	  that is avg. of the upper bound and lower bound. 
  
*/

class class1
{
	public static void main(String args[])
	{
		
		int a=10;
		int sum=a*(a+1)/2;
		System.out.println("Sum is: "+sum);
	}
}