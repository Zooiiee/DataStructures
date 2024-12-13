//Node Template
class BSTNode
{
	int data;
	BSTNode left;
	BSTNode right;

	//Constructor
	public BSTNode(int d)
	{
		data=d;
		left=null;
		right=null;
	}
}//end of BSTNode

//Tree Template
class BinarySearchTree
{
	BSTNode root;
	int cnt;
	
	//Constructor
	public BinarySearchTree()
	{	
		root=null;
		cnt=0;	//empty tree
	}

	//1.Insert
	public void Insert(int val)
	{
		//1. Make a new node
		BSTNode t = new BSTNode(val);

		//2. First node in the tree
		if(root==null)
		{
			root=t;
			cnt++;
			return;
		}

		//3. Insert in Order
		BSTNode parent = null;
		BSTNode temp = root;
		
		while(temp!=null)
		{
			parent = temp;
			if(t.data > temp.data)
			{
				temp = temp.right;
			}
			else if(t.data < temp.data)
			{
				temp = temp.left;
			}
			else
			{
				System.out.println("Duplicate Value! Cannot Insert :"+t.data);
				return;
			}
		}//end of while
	
		//Insert node t
		if(t.data < parent.data)
		{
			parent.left=t;
		}
		else
		{
			parent.right=t;
		}
		cnt++;		
	}//end of Insert

	//2.Display
	public void Display()
	{
		System.out.println("\nPreorder Traversal : ");
		Preorder(root);
		System.out.println();

		System.out.println("\nInorder Traversal : ");
		Inorder(root);
		System.out.println();

		System.out.println("\nPostorder Traversal : ");
		Postorder(root);
		System.out.println();
	}//end of Display

	//3.Preorder
	void Preorder(BSTNode r)
	{
		if(r!=null)
		{
			System.out.print(r.data+" ");
			Preorder(r.left);
			Preorder(r.right);	
		}
	}

	//4.Inorder
	void Inorder(BSTNode r)
	{
		if(r!=null)
		{
			Inorder(r.left);
			System.out.print(r.data+" ");
			Inorder(r.right);	
		}
	}

	//5.Postorder
	void Postorder(BSTNode r)
	{
		if(r!=null)
		{
			Postorder(r.left);
			Postorder(r.right);	
			System.out.print(r.data+" ");
		}
	}

	//6.Count
	public void Count()
	{
		System.out.println("\n2.Count\nNumber of Nodes : "+cnt);
	}//end of count

	//7.FindMax
	public void FindMax()
	{
		if(root==null)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			BSTNode temp = root;
			while(temp.right!=null)
			{
				temp = temp.right;
			}
			System.out.println("\n3.Maximum Node : "+temp.data);

		}
	}//end of FindMax


	//8.FindMin
	public void FindMin()
	{
		if(root==null)
		{
			System.out.println("Empty Tree");
		}
		else
		{
			BSTNode temp = root;
			while(temp.left!=null)
			{
				temp = temp.left;
			}
			System.out.println("\n4.Minimun Node : "+temp.data);

		}
	}//end of FindMax


	//9.Search
	public void Search(int val)
	{
		if(root==null)
		{
			System.out.println("Empty Tree");
			return;
		}	
		
		BSTNode temp = root;
		int flag =0;
		
		while(temp!=null)
		{
			if(val<temp.data)
			{
				temp = temp.left;
			}
			else if(val>temp.data)
			{
				temp = temp.right;
			}
			else
			{
				flag=1;
				break;
			}
		}//end of while

		if(flag==1)
		{
			System.out.println("Successful Search! "+val+" is Found");
		}
		else
		{
			System.out.println("Unuccessful Search! "+val+" Not Found");
		}
	}//end of Search

}//end of BinarySearchTree

//Main
public class BST
{
	public static void main(String[] args)
	{
		BinarySearchTree b = new BinarySearchTree();
		b.Insert(50);
		b.Insert(80);
		b.Insert(60);
		b.Insert(20);
		b.Insert(22);
		b.Insert(100);
		b.Insert(15);
		b.Insert(55);
		b.Insert(70);
		b.Insert(65);
		b.Insert(72);
		b.Insert(80);
	
		System.out.println("\n1.Display");
		b.Display();
		b.Count();
		b.FindMax();
		b.FindMin();
		System.out.println("\n5.Search");
		b.Search(80);
		b.Search(99);

	}//end of main
}//end of BST
