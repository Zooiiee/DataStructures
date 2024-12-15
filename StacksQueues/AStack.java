//Stack - Array Implementation

import java.util.Scanner;

class Stack
{
	int max;
	int[] sArray;
	int tos;
	
	//Constructor
	public Stack(int size)
	{
		max = size;
		sArray = new int[max];
		tos=-1;
	}

	//Methods
	
	//1. Push
	public void Push(int val)
	{
		if(tos == max-1)
		{
			//OverFlow
			System.out.println("Stack Overflow");
		}
		else
		{
			sArray[++tos]=val;
			System.out.println("Pushed : "+val);
		}
	}//end of push


	//2. Pop
	public void Pop()
	{
		if(tos == -1)
		{
			//UnderFlow
			System.out.println("Stack UnderFlow");
		}
		else
		{
			System.out.println("Popped : "+sArray[tos]);
			tos--;
		}


	}//end of Pop


	//3.Peek
	public void Peek()
	{
		if(tos == -1)
		{
			//Empty Stack
			System.out.println("The Stack is Empty!");
		}
		else
		{
			System.out.println("Element at the Top Of the Stack : "+sArray[tos]);
		}

	}//end of Peek


	//4.Display
	public void Display()
	{
		if(tos == -1)
		{
			//Empty Stack
			System.out.println("The Stack is Empty!");
		}
		else
		{
			System.out.println("Stack : ");
			for(int i=tos; i>=0; i--)
			{
				System.out.println("| "+sArray[i]+" |");
			}
		}


		
	}//end of Display

}//end of Stack

//Implementation
class AStack
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Stack s = new Stack(4);

		char ch;

		do
		{
			System.out.println("\n*** Stack - Array Implementation ***");
			System.out.println("\n1. Push an element on to the Stack");
			System.out.println("2. Pop an element from the Stack");
			System.out.println("3. Peek at the Top of the Stack");
			System.out.println("4. Display the Stack");

		
			System.out.println("\nEnter Your Choice : ");
			int choice  = scan.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Option 1: Push");
					System.out.print("Enter the Element to be pushed into the Stack : ");
					s.Push(scan.nextInt());
					s.Display();
					break;

				case 2:
					System.out.println("Option 2: Pop");
					s.Pop();
					s.Display();
					break;

				case 3:
					System.out.println("Option 3: Peek");
					s.Peek();
					s.Display();
					break;
		
				case 4:
					System.out.println("Option 4: Display");
					s.Display();
					break;
	
				default:
					System.out.println("Incorrect Choice");
					break;

			}// end of switch
			

			System.out.println("\nDo you want to continue? (y/n) : ");
			ch = scan.next().charAt(0);

		}
		while(ch=='y' || ch=='Y');

	}//end of main
	
}//end of AStack
