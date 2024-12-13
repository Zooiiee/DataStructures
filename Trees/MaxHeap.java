public class MaxHeap
{
	private int[] heap;
	private int size;
	private int capacity;

	//Constructor
	public MaxHeap(int capacity)
	{
		this.capacity=capacity;
		this.heap = new int[capacity];
		this.size=0;
	}

	//Parent Index
	public int parent(int i)
	{
		return (i-1)/2;
	}
	
	//Left Child
	public int leftChild(int i)
	{
		return (2*i)+1;
	}

	//Right Child
	public int rightChild(int i)
	{
		return (2*i)+2;
	}

	//Insert
	public void Insert(int value)
	{
		if(size==capacity)
		{
			System.out.println("Heap is Full!!");
			return;
		}
		
		//Insert at the end of the array
		heap[size] = value;
		int current = size;
		size++;

		//reheapUp - Max Heap Property
		while(current>0 && heap[current] >heap[parent(current)])
		{
			swap(current,parent(current));
			current=parent(current);
		}
	}//end of insert

	//Delete
	public int Delete()
	{
		if(size==0)
		{
			System.out.println("Heap is Empty!!");
			return -1;
		}
		int max = heap[0];
		heap[0] = heap[size-1];
		size--;
		
		reheapDown(0);
		return max;
	}//end of delete

	//reheapDown - Max Heap Property
	public void reheapDown(int i)
	{
		int largest = i;
		int left = leftChild(i);
		int right = rightChild(i);

		//Find Larger of the left & right child
		if(left<size && heap[left] > heap[largest])
		{
			largest=left;
		}
		if(right<size && heap[right] > heap[largest])
		{
			largest=right;
		}
		//if root is not the largest - swap and continue
		if(largest!= i)
		{
			swap(i,largest);
			reheapDown(largest);
		}
		
	}//end of reheapDown

	//Swap
	public void swap(int i, int j)
	{
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	//Display
	public void display()
	{
		System.out.println("Max Heap : " );
		for(int i=0 ; i<size ; i++)
		{
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}

	//main
	public static void main(String[] args)
	{
		MaxHeap h = new MaxHeap(12);

		h.Insert(23);
		h.Insert(7);
		h.Insert(92);
		h.Insert(6);
		h.Insert(12);
		h.Insert(14);
		h.Insert(40);
		h.Insert(44);
		h.Insert(20);
		h.Insert(21);
		
		h.display();
		
		System.out.println("\nElement Deleted : "+h.Delete());
		h.display();

	}//end of main

}//end of MaxHeap                                                                       

