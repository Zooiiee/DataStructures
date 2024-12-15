//Priority Queues 

import java.util.Scanner; 


//1. Node Template 
class PQNode 
{ 
	int data; 
	int pri; 
	PQNode next; 

	//Constructor 
	public PQNode (int d, int p) 
	{ 
		data = d; 
		pri = p;
		next = null; 
	} 
}//end of PQNode 


//2. Queue Template 
class PriQue 
{ 
	PQNode front; 
	PQNode rear; 

	//Constructor 
	public PriQue() 
	{ 
		front = null; 
		//tail = null; 
	} 


	//Enqueue 
	public void Enqueue(int val, int pr) 
	{ 
		//1.make a node 
		PQNode x =new PQNode(val, pr); 

		//2.first node in the PQ 
		if(front == null) 
		{ 
			front = x; 
			rear = x; 
		} 
		else 
		{ 
			PQNode prev = null; 
			PQNode tmp = front; 
			while(tmp!=null) 
			{ 
				if(x.pri < tmp.pri) 
				{	 
					break; 
				} 
				prev = tmp; 
				tmp = tmp.next; 
			} 
			if(tmp == front) //front node insertion 
			{
				x.next = front; 
				front = x; 
			} 
			else if(prev == rear) //rear node insertion 
			{ 
				rear.next = x; 
				rear = x; 
			} 
			else //any other node insertion 
			{ 
				prev.next = x; 
				x.next = tmp; 
			} 
		} 
	}//end of enqueue 

	//Dequeue 
	public void Dequeue() 
	{ 
		if(front == null) 
		{ 
			System.out.println("Queue Underflow!"); 
		} 
		else 
		{ 
			System.out.println("Element removed: "+front.data+","+ front.pri ); 
			if(front == rear) //single element deletion 
			{ 
				front = null; 
				rear = null; 
			} 
			else 
			{ 
				front = front.next; 
			} 
		} 
	}//end of dequeue 

	//Display 
	public void Display() 
	{ 
		if(front == null) 
		{ 
			System.out.println("Queue Underflow!");
		} 
		else 
		{ 
			PQNode tmp = front; 
			System.out.println("Queue Contains: "); 
			System.out.print("| "); 
			while(tmp!=null) 
			{ 
				System.out.print("Task: "+tmp.data+","+"Priority: "+tmp.pri+" | "); 
				tmp = tmp.next; 
			} 
			System.out.print(""); 
		} 
	}//end of display 

	//PeekFront 
	public void PeekFront() 
	{ 
		//empty queue 
		if(front == null) 
		{ 
			System.out.println("Queue Overflow"); 
		} 
		else 
		{ 
			System.out.println("Element at the Front: "+front.data); 
		} 
	}//end of PeekFront 

	//PeekRear 
	public void PeekRear() 
	{ 
		//empty queue 
		if(front == null) 
		{ 
			System.out.println("Queue Underflow"); 
		} 
		else 
		{ 
			System.out.println("Element at the Rear: "+rear.data); 
		}
	}//end of PeekRear 
}//end of PriQue 


//Menu 
class PQueue 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		PriQue c = new PriQue(); 
		char ch; 
			
		do 
		{ 
			System.out.println("\n***Circular Queue Array Implementation***\n"); 
			System.out.println("1. Enqueue operation"); 
			System.out.println("2. Dequeue operation"); 
			System.out.println("3. Display the queue"); 
			System.out.println("4. Peek Front operation"); 
			System.out.println("5. Peek Rear operation"); 

			System.out.println("\nEnter your choice: "); 
			int choice = sc.nextInt(); 

			switch(choice) 
			{ 
					case 1: 
						System.out.println("Option 1: Enqueue Operation\n\nEnter The Queue Element:"); 
						int v = sc.nextInt(); 
						System.out.println("Enter it's Priority: "); 
						int p = sc.nextInt(); 
						c.Enqueue(v,p); 
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
			System.out.println("\nDo you want to continue(y/n)?: "); 
			ch = sc.next().charAt(0); 
		
		}while(ch == 'y'|| ch=='Y');//end of while 

	}//end of main 

}//end of PQueue class 
