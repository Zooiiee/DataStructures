import java.util.Scanner;

// 1. Node Template
class Node
{	
	int data;
	Node next;

	//Constructor
	public Node(int d)
	{
		data = d;
		next = null;
	}	
	
}//end of node


// 2. List Template
class List
{
	Node head;
	Node tail;

	//Constructor
	public List()
	{
		head=null;
		tail=null;		
	}


	//a.Insert at the end of the SLL
	public void InsertTail(int val)
	{
		//1. Make a new node
		Node x = new Node(val);

		//2. Check for First Node
		if(head == null)
		{
			head = x;
			tail = x;
		}
		//3. For other Nodes
		else
		{
			tail.next =x; 	//link to the tail of SLL
			tail = x;	//update tail to x
		}
	}//end of InsertTail


	//a.Insert at the head of the SLL
	public void InsertHead(int val)
	{
		//1. Make a new node
		Node x = new Node(val);

		//2. Check for First Node
		if(head == null)
		{
			head = x;
			tail = x;
		}
		//3. For other Nodes
		else
		{
			x.next =head; 	//link to the head of SLL
			head = x;	//update head to x
		}
	}//end of InsertHead

	
	//b.Count the no. of nodes
	public void Count()
	{	
		Node temp = head;
		int count=0;
		while(temp !=null)
		{
			count++;
			temp = temp.next;
		}
		System.out.println(count);
		
	}//end of count

	//c.Display The SLL
	public void Display()
	{
		Node temp = head;
		while(temp !=null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("End of SLL");	
	}//end of Display

	//d.Search for a node
	public void Search(int val)
	{
		Node temp = head;
		int flag=0;
		while(temp !=null)
		{
			if(temp.data==val)
			{	
				flag=1;
				break;
			}

			temp = temp.next;
		}
		if(flag==1)
		{
			System.out.println("Successful Search: Element Found!!");
		}
		else
		{
			System.out.println("Unsuccessful Search: Element Not Found!!!!");
		}
		
	}//end of Search


	//e.Delete a node
	public void Delete(int val)
	{
		//Step 1:Search

		Node temp = head;
		int flag=0;
		Node prev = null;
		while(temp !=null)
		{
			if(temp.data==val)
			{	
				flag=1;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		
		//Step 2:Unsuccessful Search - RETURN CONTROL

		if(flag==0)
		{
			System.out.println("Unsuccessful Search: Number not found in the List!!");
			return;
		}
				
		
		//Step 3:Successful Search
	
		//Step 3a: Deleting the only node
		if(temp == head && temp ==tail)
		{
			head = null;
			tail = null;
		}

		//Step 3b: Deleting the Head node
		else if(temp == head)
		{
			head = head.next;
		}
		
		//Step 3c: Deleting the Tail node
		else if(temp == tail)
		{
			tail = prev;
			tail.next = null;
		}

		//Step 3d: Deleting any other node
		else
		{
			prev.next = temp.next;
		}
		System.out.println("\nSingly Linked List : ");
		Display();
	}//end of Delete


}//end of List


// 3. Interface
class SLL
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
			
		//Create object of list
		List s = new List();

		char ch;

		do
		{
			System.out.println("\n*** Singly Linked List ***");
			System.out.println("\n1. Insert at the end of the SLL");
			System.out.println("2. Insert at the head of the SLL");
			System.out.println("3. Count the no. of nodes");
			System.out.println("4. Display The SLL");
			System.out.println("5. Search for a node");
			System.out.println("6. Delete a node");
			
			System.out.println("\nEnter Your Choice : ");
			int choice  = scan.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Option 1: Insert at the end of the SLL\n\nEnter The Node Element: ");
					s.InsertTail(scan.nextInt());
					break;

				case 2:
					System.out.println("Option 2: Insert at the head of the SLL\n\nEnter The Node Element:");
					s.InsertHead(scan.nextInt());
					break;


				case 3:
					System.out.println("Option 3: Count the no. of nodes\n");
					System.out.print("The number of Nodes in the SLL: ");
					s.Count();
					break;

				case 4:
					System.out.println("Option 4: Display The SLL\n");	
					System.out.print("Singly Linked List : ");
					s.Display();
					break;

				case 5:
					System.out.print("Option 5: Search for a node\n\nEnter the Node Element to Search:");
					s.Search(scan.nextInt());
					break;

				case 6:
					System.out.print("Option 6: Delete a node\n\nEnter the Node Element to Delete:");
					s.Delete(scan.nextInt());
					break;

				default:
					System.out.println("Incorrect Choice");
					break;

			}//end of switch
			
			System.out.println("\nDo you want to continue? (y/n) : ");
			ch = scan.next().charAt(0);

		}while(ch=='y' || ch=='Y');
		

	}//end of main

}//end of SLL



