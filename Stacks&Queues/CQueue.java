//Circular Queues - Array Implementation
                                       

import java.util.Scanner; 
//1. Queue Template 
class CirQue 
{ 
	int max; 
	int[] qArray; 
	int front; 
	int rear; 
	int cnt; 

	//Constructor 
	public CirQue(int size) 
	{
		max = size; 
		qArray = new int[max]; 
		front =-1; 
		rear = -1; 
		cnt = 0; 
	} 

	//Enqueue 
	public void Enqueue(int val) 
	{ 
		//Queue Full 
		if(cnt == max) 
		{ 
			System.out.println("Queue Overflow"); 
		} 
		else 
		{ 
			if(cnt == 0) //First element 
			{ 
				front = 0; 
			} 

			rear = (rear+1)%max; 
			qArray[rear] = val; 
			cnt++; 
		} 
	}//end of enqueue 

	//Dequeue 
	public void Dequeue() 
	{ 
		if(cnt==0) 
		{ 
			System.out.println("Queue Underflow!"); 
		} 
		else 
		{ 
			System.out.println("Element removed: "+ qArray[front]); 
			
			//single element 
			if(front==rear) 
			{ 
				front = -1; 
				rear = -1; 
			} 
			else
			{ 
				front = (front+1)%max; 
			} 
			cnt--; 
		} 
	}//end of dequeue 

	//Display 
	public void Display() 
	{ 
		if(cnt == 0) 
		{ 
			System.out.println("Queue Underflow!"); 
		} 
		else 
		{ 
			System.out.println("Queue contains: "); 
			int j = front; 
			for(int i=1; i<=cnt; i++) 
			{ 
				System.out.print("| "+qArray[j]+" |->"); 
				j = (j+1)%max; 
			} 
			System.out.println("\n");
		} 
	}//end of display 

	//PeekFront 
	public void PeekFront() 
	{ 
		if(cnt==0) 
		{ 
			System.out.println("Queue Overflow!"); 
		} 
		else 
		{ 
			System.out.println("Element at the front: "+ qArray[front]); 
		} 
	}//end of PeekFront 

	//PeekRear 
	public void PeekRear() 
	{ 
		if(cnt==0) 
		{
			System.out.println("Queue Underflow!"); 
		} 
		else 
		{ 
			System.out.println("Element at the front: "+ 
			qArray[rear]); 
		} 
	}//end of PeekRear 

}//end of CirQue 


//Menu 
class CQueue 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		CirQue c = new CirQue(4); 
		char ch; 

		do 
		{ 
			System.out.println("\n***Circular Queue Array Implementation***\n"); 
			System.out.println("1. Enqueue operation"); 
			System.out.println("2. Dequeue operation"); 
			System.out.println("3. Display the queue"); 
			System.out.println("4. Peek Front operation"); System.out.println("5. Peek Rear operation"); 
			
			System.out.println("\nEnter your choice: "); 
			int choice = sc.nextInt(); 
			switch(choice) 
			{ 
				case 1: 
					System.out.println("Option 1: Enqueue Operation\n\nEnter The Queue Element:"); 
					c.Enqueue(sc.nextInt()); 
					c.Display();
					break; 
				case 2: 
					System.out.println("Option 2: Dequeue Operation");
					c.Dequeue(); 
					c.Display();
					break; 
				case 3: 
					System.out.println("Option 3: Display The Queue");
					c.Display();
					break; 
				case 4: 
					System.out.println("Option 4: Peek Front Operation");
					c.PeekFront(); 
					c.Display();
					break; 
				case 5: 
					System.out.println("Option 5: Peek Rear Operation");
					c.PeekRear(); 
					c.Display();
					break; 
				default: 
					System.out.println("Incorrect choice!"); 
					break; 
			} 
			System.out.println("Do you want to continue(y/n)?: "); 
			ch = sc.next().charAt(0); 

		}while(ch == 'y'|| ch=='Y');//end of while 

	}//end of main 

}//end of CQueue class 

