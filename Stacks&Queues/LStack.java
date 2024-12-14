//Stack - List Implementation

import java.util.Scanner;

//Node Template
class SNode 
{
	int data;
	SNode next;
	
	//constructor
	public SNode(int d)
	{
		data = d;
		next = null;
	}
}//end of SNode

//Stack Template
class SList
{
	SNode tos;
	
	public SList()
	{
		tos = null;
	}
	
	//1.Push
	public void Push(int val)
	{
		//1.Make a Node
		SNode x = new SNode(val);
		
		//2.First Node in the Stack
		if(tos == null)
		{
			tos = x;
		}
		//3.Insert at the TOS
		else
		{
			x.next = tos;	//link x to the stack
			tos=x;		//update tos
		}

	}//end of push

	//2.Pop
	public void Pop()
	{
		if(tos==null)
		{
			System.out.println("Stack Underflow!!");
		}
		else
		{
			System.out.println("Data Popped : "+ tos.data);
			tos = tos.next;		//for single node tos updates to null
		}
	}//end of Pop

	
	//3.Peek
	public void Peek()
	{
		if(tos==null)
		{
			System.out.println("Stack Underflow!!");
		}
		else
		{
			System.out.println("Data at the Top of the Stack : "+ tos.data);

		}
	}//end of Peek

	
	//4.Display
	public void  Display()
	{
		if(tos == null)
		{
			System.out.println("Stack Underflow!!");
		}
		else
		{
			SNode temp = tos;
			System.out.println("Stack : ");
			while(temp != null)
			{
				System.out.println("| " +temp.data+ " |");
				temp = temp.next;
		
			}
		}
	}//end of Display

}//end of SList


//Menu
class LStack
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		SList s = new SList();

		char ch;

		do
		{
			System.out.println("\n*** Stack - List Implementation ***");
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

}//end of LStack
