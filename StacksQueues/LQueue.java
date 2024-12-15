//Ordinary Queues - List Implementation

import java.util.Scanner;

//1. Node Template
class QNode
{
	int data;
	QNode next;

	//Constructor
	public QNode(int d)
	{
		data = d;
		next = null;
	}	

}//End of QNode

//2. Queue Template
class QList
{
	QNode front;
	QNode rear;

	//Constructor
	public QList()
	{
		front=null;
		rear=null;
	}

	//1.Enqueue
	public void Enqueue(int val)
	{
		//1.Make a new Node
		QNode x = new QNode(val);

		//2.Check for First element
		if(front == null)
		{
			front = x;
			rear = x;
		}

		//3.Add at the rear
		else
		{
			rear.next = x;
			rear = x;
		}
	}

	//2.Dequeue
	public void Dequeue()
	{
		if(front==null)
		{
			System.out.println("Queue UnderFlow!!");
		}
		else
		{
			System.out.println("Element Removed is : "+front.data);
			if(front==rear) //single el deletion
			{
				front = null;
				rear=null;
			}
			else
			{
				front = front.next;
			}
		}

	}//end of Dequeue

	//3.Display
	public void Display()
	{
		if(front==null)
		{
			System.out.println("Queue UnderFlow!!");
		}
		else{
		QNode temp = front;
		while(temp !=null)
		{
			System.out.print("| "+temp.data + " | -> ");
			temp = temp.next;
		}
		System.out.println("end");	
		}//end of else
	}//end of Display

	//4.PeekFront
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

	//5.PeekRear
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

	

}//end of QList


//3.Menu
class LQueue
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		QList q = new QList();
		char ch;

		do
		{
			System.out.println("\n*** Queue - List Implementation ***");
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
}//end of LQueue
