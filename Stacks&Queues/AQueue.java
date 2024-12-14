//Ordinary Queue - Array Implementation

import java.util.Scanner;

class Queue
{
	int max;
	int[] qArray;
	int front;
	int rear;

	//Constructor
	public Queue(int size)
	{	
		max = size;
		qArray= new int[max];
		front=-1;
		rear=-1;
	}
	
	//1.Enqueue
	public void Enqueue(int val)
	{
		if(rear==max-1)
		{
			System.out.println("Queue Overflow!!");
		}
		else
		{
			//For first element in the Queue
			if(front==-1)
			{
				front++;
			}
			
			rear++;
			qArray[rear]=val;
		}
		
		
	}

	//2.Dequeue
	public void Dequeue()
	{
		//Empty Queue
		if(front==-1)
		{
			System.out.println("Queue Underflow!!");
		}
		else
		{
			System.out.println("Element Removed is : "+qArray[front]);
			if(front==rear)
			{
				front =-1;		
				rear=-1;
			}
			else
			{
				front++;
			}
		}
	}
	
	//3.Display
	public void Display()
	{
		//Empty Queue
		if(front==-1)
		{
			System.out.println("Queue UnderFlow!!");
		}	
		else
		{
			System.out.println("Queue : ");
			System.out.print(" | ");
			for(int i=front; i<=rear;i++)
			{
				System.out.print(qArray[i]+" | ");

			}
		System.out.println("\n");

		}
	}

	//4.PeekFront
	public void PeekFront()
	{
		//Empty Queue
		if(front==-1)
		{
			System.out.println("Queue UnderFlow!!");
		}	
		else
		{
			System.out.println("Element at The Front of The Queue : "+qArray[front]);
		}
	}

	//5.PeekRear
	public void PeekRear()
	{
		//Empty Queue
		if(front==-1)
		{
			System.out.println("Queue UnderFlow!!");
		}	
		else
		{
			System.out.println("Element at The Rear of The Queue : "+qArray[rear]);
		}
	}


}//end of Queue

//menu
class AQueue
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Queue q = new Queue(4);
	
		char ch;

		do
		{
			System.out.println("\n*** Queue - Array Implementation ***");
			System.out.println("\n1. Enqueue Operation");
			System.out.println("2. Dequeue Operation");
			System.out.println("3. Display The Queue");
			System.out.println("4. Peek Front Operation");
			System.out.println("5. Peek Rear Operation");

		
			System.out.println("\nEnter Your Choice : ");
			int choice  = scan.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Option 1: Enqueue Operation\n\nEnter The Queue Element:");
					q.Enqueue(scan.nextInt());
					q.Display();
					break;

				case 2:
					System.out.println("Option 2: Dequeue Operation");
					q.Dequeue();
					q.Display();
					break;

				case 3:
					System.out.println("Option 3: Display The Queue");
					q.Display();
					break;
		
				case 4:
					System.out.println("Option 4: Peek Front Operation");
					q.PeekFront();
					q.Display();
					break;

				case 5:
					System.out.println("Option 5: Peek Rear Operation");
					q.PeekRear();
					q.Display();
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

}//end of Aqueue
