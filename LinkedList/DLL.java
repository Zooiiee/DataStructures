import java.util.Scanner;

//Class Node
class DNode
{
	int data;
	DNode left;
	DNode right;

	//Constructor
	public DNode(int d)
	{
		data = d;
		right = null;
		left = null;
	}
	
}


//Class List
class DList
{
	DNode head;
	DNode tail;
	
	//Constructor
	public DList()
	{
		head = null;
		tail = null;
	}


	//a.Insert at the end of the DLL
	public void InsertTail(int val)
	{
		//1. Make a new node
		DNode x = new DNode(val);

		//2. Check for First Node
		if(head == null)
		{
			head = x;
			tail = x;
		}

		//3. For other nodes
		else
		{
			tail.right = x;
			x.left = tail;
			tail = x;
		}

	
	} //end of InsertTail


	//g.Insert at the head of the DLL
	public void InsertHead(int val)
	{
		//1. Make a new node
		DNode x = new DNode(val);

		//2. Check for First Node
		if(head == null)
		{
			head = x;
			tail = x;
		}

		//3. For other nodes
		else
		{
			x.right = head;
			head.left =x;
			head = x;
			
		}
	}//end of InsertHead

	//b.Display The DLL
	public void Display()
	{
		DNode temp = head;
		while(temp !=null)
		{
			System.out.print("| "+temp.data+" |" + "<->");
			temp = temp.right;
		}
		System.out.println("End of DLL");	
	

	} //end of display

	//c.Count the no. of nodes
	public void Count()
	{
		DNode temp = head;
		int cnt =0;
		while(temp != null)
		{
			cnt++;
			temp=temp.right;
		}
		System.out.println(cnt);
	}//end of count



	//d.Search for a node
	public void Search(int val)
	{
		DNode temp = head;
		int flag = 0;
		while(temp != null)
		{
			if(temp.data==val)
			{
				flag =1;
				break;
			}
			temp = temp.right;
		}
		if(flag ==0)
		{
			System.out.println("Unsuccessful Search!!Element Not Found in the Array");
		}
		else
		{
			System.out.println("Successful Search!! Element Found in the Array!!!!");

		}
	}//end of Search

	//e.Delete a node
	public void Delete(int val)
	{
		//1. Search
		DNode temp = head;
		DNode prev = null;
		int flag = 0;
		while(temp != null)
		{
			if(temp.data==val)
			{
				flag =1;
				break;
			}
			prev = temp;
			temp = temp.right;
		}


		//2.Not found - return control
		if(flag == 0)
		{
			System.out.println("Unsuccessful Search!!Element Not Found in the Array");
			return;
		}

		
		//3.Successful Search
		//3a. Deleting the only node
		if(temp == head && temp == tail)
		{
			head = null;
			tail = null;
		}

		//3b. Deleting the Head Node
		else if(temp == head)
		{
			head = head.right;
			head.left = null;
		}


		//3c. Deleting the tail Node
		else if(temp == tail)
		{
			tail = tail.left;
			tail.right=null;
		}
	

		//3d. Deleting any other node
		else
		{
			prev.right = temp.right;
			(temp.right).left = prev;
			
		}
		System.out.println("\nDLL After Deletion : ");
		Display();

	}//end of delete

}//end of Node


//DLL Interface
class DLL
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
			
		//Create object of list
		DList s = new DList();

		char ch;

		do
		{
			System.out.println("\n***Doubly Linked List***");
			System.out.println("\n1. Insert at the Tail of the DLL");
			System.out.println("2. Display The DLL");
			System.out.println("3. Count the no. of Nodes");
			System.out.println("4. Search for a node");
			System.out.println("5. Delete a node");
			System.out.println("6. Insert at the Head of the DLL");

		
			System.out.println("\nEnter Your Choice : ");
			int choice  = scan.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Option 1: Insert at the end of the DLL\n\nEnter The Node Element: ");
					s.InsertTail(scan.nextInt());
					break;

				case 2:
					System.out.println("Option 2: Display The DLL ");
					System.out.println("Doubly Linked List : ");
					s.Display();
					break;

				case 3:
					System.out.println("Option 3: Count the No. of Nodes ");
					System.out.print("The number of Nodes in the DLL: ");
					s.Count();
					break;

				case 4:
					System.out.println("Option 4: Search for a Node\n\nEnter The Node Element to Search: ");
					s.Search(scan.nextInt());
					break;

				case 5:
					System.out.println("Option 5: Delete a node\n\nEnter the Node Element to Delete:");
					s.Delete(scan.nextInt());

					break;
			
				case 6:
					System.out.println("Option 6: Insert at the head of the DLL\n\nEnter The Node Element: ");
					s.InsertHead(scan.nextInt());
					break;

				default:
					System.out.println("Incorrect Choice");
					break;

			}//end of switch

			System.out.println("\nDo you want to continue? (y/n) : ");
			ch = scan.next().charAt(0);

		}while(ch=='y' || ch=='Y');

	}// end of main

}// end of DLL

