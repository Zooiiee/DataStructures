import java.util.Scanner;

//1. Node Template 
class CNode
{
	int data;
	CNode next;

	public CNode(int d)
	{
		data = d;
		next = null;
	}

} //end of CNode


//2. List Template
class CList
{
	CNode head = null;
	CNode tail = null;

	public CList()
	{
		head = null;
		tail = null;
	}

	//1.Insert at the Tail of the List
	public void InsertTail(int val)
	{
		//1. Make a new Node
		CNode x = new CNode(val);
			
		//2. Check for Head
		if(head==null)
		{
			head = x;
			tail = x;
			tail.next = head; 	//Circularity
		}

		//3. For other nodes
		else
		{
			tail.next = x; 		//link x to tail
			tail = x; 		//update tail
			tail.next = head; 	//Circularity
		}
	}//end of InsertTail

	//6.Insert at the Head of the List
	public void InsertHead(int val)
	{
		//1. Make a new Node
		CNode x = new CNode(val);
			
		//2. Check for Head
		if(head==null)
		{
			head = x;
			tail = x;
			tail.next = head; 	//Circularity
		}

		//3. For other nodes
		else
		{
			x.next = head; 		//link x to head
			head = x; 		//update head
			tail.next = head; 	//Circularity
		}
	}//end of InsertHead


	//2.Display The CLL
	public void Display()
	{
		CNode temp = head;
		if(head == null)
		{
			System.out.println("The List is Empty");
			return;
		}

		do
		{
			System.out.print(temp.data+ " -> ");
			temp = temp.next;
		}while(temp !=head);
		System.out.println("Back To Head");

	}//end of Display


	//3.Count the No. of Nodes
	public void Count()
	{
		CNode temp = head;
		int cnt =0;

		do
		{
			cnt++;
			temp=temp.next;
		}while(temp !=head);
		System.out.println(cnt);
	}//end of Count


	//4.Search for a Node
	public void Search(int val)
	{
		CNode temp = head;
		int flag = 0;
		
		do
		{
			if(temp.data == val)
			{
				flag =1;
				break;
			}
			temp = temp.next;
		}while(temp != head);

		if(flag==1)
		{
			System.out.println("Found!!");
		}
		else
		{
			System.out.println("Not Found!!!!");
		}

	}//end of Search	


	//5.Delete a Node
	public void Delete(int val)
	{
		//Step 1: Search for val
		CNode temp = head;
		CNode prev = head;
		int flag = 0;
		
		do
		{
			if(temp.data == val)
			{
				flag =1;
				break;
			}
			prev = temp;
			temp = temp.next;
		}while(temp != head);
		
		//Step 2:Unsuccessful Search - RETURN CONTROL

		if(flag==0)
		{
			System.out.println("Node Not Found!!");
			return;
		}

		//Step 3:Successful Search
	
		//Step 3a: Deleting the only node
		if(temp==head && temp==tail)
		{
			head = null;
			tail = null;
		}

		//Step 3b: Deleting the Head node
		else if(temp==head)
		{
			head = temp.next;
			tail.next = head;
		}


		//Step 3c: Deleting the Tail node
		else if(temp==tail)
		{
			tail = prev;
			tail.next = head;
		}
		
		//Step 3d: Deleting any other node
		else
		{
			prev.next = temp.next;
		}
		System.out.println("\nCircular Linked List : ");
		Display();

	}//end of delete

} //end of CList


//3. Interface
class CLL
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
			
		//Create object of Clist
		CList s = new CList();

		char ch;
		
		do
		{
			System.out.println("\n***Circular Linked List***");
			System.out.println("\n1. Insert at the Tail of the CLL");
			System.out.println("2. Insert at the Tail of the CLL");
			System.out.println("3. Display The CLL");
			System.out.println("4. Count the no. of Nodes");
			System.out.println("5. Search for a node");
			System.out.println("6. Delete a node");
		
			
			System.out.println("\nEnter Your Choice : ");
			int choice  = scan.nextInt();

			switch(choice)
			{
				case 1:
					System.out.println("Option 1: Insert at the end of the CLL\n\nEnter The Node Element: ");
					s.InsertTail(scan.nextInt());
					break;
				case 2:
					System.out.println("Option 2: Insert at the Head of the CLL\n\nEnter The Node Element: ");
					s.InsertHead(scan.nextInt());
					break;

				case 3:
					System.out.println("Option 3: Display The CLL ");
					System.out.print("Circular Linked List : ");
					s.Display();
					break;
				case 4:
					System.out.println("Option 4: Count the No. of Nodes ");
					System.out.print("No. of Nodes in the CLL : ");
					s.Count();
					break;
				case 5:
					System.out.print("Option 5: Search for a Node\n\nEnter The Node Element to Search: ");
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

		}while(ch =='y' || ch =='Y');
	}//end of main
}//end of CLL



