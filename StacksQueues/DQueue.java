//Program: Double Ended Queues
    

import java.util.Scanner;

//1.Node Template
class DQNode
{
	int data;
	DQNode right;
	DQNode left;

	//Constructor
	public DQNode(int d)
	{
		data = d;
		right = null;
		left = null;
	}
}

//2. Queue Template
class DQue
{
	DQNode front;
	DQNode rear;

	//constructor
	public DQue()
	{
		front = null;
		rear =  null;
	}

	//EnqueueRear
	public void EnqueueRear(int val)
	{
		//1.Make a new Node
		DQNode x = new DQNode(val);

		//2.Check for First element
		if(front == null)
		{
			front = x;
			rear = x;
		}

		//3.Add at the rear
		else
		{
			rear.right = x;
			x.left = rear;
			rear = x;
		}
	}//end of EnqueueRear

	
	//EnqueueFront
	public void EnqueueFront(int val)
	{
		//1.Make a new Node
		DQNode x = new DQNode(val);

		//2.Check for First element
		if(front == null)
		{
			front = x;
			rear = x;
		}

		//3.Add at the front
		else
		{
			x.right = front;
			front.left = x;
			front = x;
		}
	}//end of EnqueueFront


	//DequeueRear
	public void DequeueRear()
	{
		if(front == null)
		{
			System.out.println("Queue UnderFlow!!!");
		}
		else
		{
			System.out.println("Element Removed from the Rear : " + rear.data);
			//Single Element deletion
			if(front == rear)
			{
				front = null;
				rear = null;
			}
			else
			{
				rear = rear.left;
				rear.right = null;
			}
		}
	}

	//DequeueFront
	public void DequeueFront()
	{
		if(front == null)
		{
			System.out.println("Queue UnderFlow!!!");
		}
		else
		{
			System.out.println("Element Removed from the Front : " + front.data);
			//Single Element deletion
			if(front == rear)
			{
				front = null;
				rear = null;
			}
			else
			{
				front = front.right;
				front.left = null;
			}
		}
	}


	//PeekFront
	public void PeekFront()
	{	
		if(front==null)
		{
			System.out.println("Queue UnderFlow!!");
		}
		else
		{
			System.out.println("Element at The Front of The Queue : "+front.data);
		}
	}//end of PeekFront

		
	//PeekRear
	public void PeekRear()
	{	
		if(front==null)
		{
			System.out.println("Queue UnderFlow!!");
		}
		else
		{
			System.out.println("Element at The Rear of The Queue : "+rear.data);
		}
	}//end of PeekFront


	//Display
	public void Display()
	{
		if(front==null)
		{
			System.out.println("Queue UnderFlow!!");
		}
		else{
			DQNode temp = front;
			System.out.println("\nThe Queue : ");
			while(temp !=null)
			{
				System.out.print("| "+temp.data + " | <-> ");
				temp = temp.right;
			}
		System.out.println("end");	
		}//end of else
	}//end of Display


}//end of DQue

//menu
class DQueue
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		DQue d = new DQue();
	
		char ch;

		do
		{
			System.out.println("\n*** Double Ended Queue ***");
			System.out.println("\n1. Enqueue Front Operation");
			System.out.println("2. Enqueue Rear Operation");
			System.out.println("3. Dequeue Front Operation");
			System.out.println("4. Dequeue Rear Operation");
			System.out.println("5. Peek Front Operation");
			System.out.println("6. Peek Rear Operation");
			System.out.println("7. Display The Queue");

		
			System.out.println("\nEnter Your Choice : ");
			int choice  = scan.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Option 1: Enqueue Front Operation\n\nEnter The Queue Element:");
					d.EnqueueFront(scan.nextInt());
					d.Display();
					break;

				case 2:
					System.out.println("Option 2: Enqueue Rear Operation\n\nEnter The Queue Element:");
					d.EnqueueRear(scan.nextInt());
					d.Display();
					break;

				case 3:
					System.out.println("Option 3: Dequeue Front Operation");
					d.DequeueFront();
					d.Display();
					break;
		
				case 4:
					System.out.println("Option 4: Dequeue Rear Operation");
					d.DequeueRear();
					d.Display();
					break;

				case 5:
					System.out.println("Option 5: Peek Front Operation");
					d.PeekFront();
					d.Display();
					break;

				case 6:
					System.out.println("Option 6: Peek Rear Operation");
					d.PeekRear();
					d.Display();
					break;

				case 7:
					System.out.println("Option 7: Display the Queue ");
					d.Display();
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

}//end of Dqueue

