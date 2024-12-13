//Modulo Division & Linear Probe

class HashTable
{
	private Integer[] table;
	private int size;
	private int capacity;

	//Constructor
	public HashTable(int capacity)
	{
		this.capacity= capacity;
		this.size = size;
		this.table = new Integer[capacity];
	}//end of constructor
	
	//Hash Function - Modulo Division
	private int hash(int key)
	{
		return key%capacity;
	}//end of hash

	//Insert Key into hash
	public void insertKey(int key)
	{
		if(size>=capacity)
		{
			System.out.println("Hash Table is Full!!\nCannot insert Key : "+key+"\n");
			return;
		}

		int index = hash(key);
		while(table[index]!=null)	//collision
		{
			//Linear Probe
			index= (index+1)%capacity;
		}
		table[index] = key;
		size++;
	}//end of InsertKey

	//Display
	public void display()
	{
		System.out.println("Final Hash Table: ");
		for(int i =0; i<capacity; i++)
		{
			if(table[i]!=null)
			{
				System.out.println("Index "+i +" : "+table[i]);
			}
			else
			{
				System.out.println("Index "+i +": "+"null");
			}
		}
	}//end of display
	
//Main
	public static void main(String[] args)
	{
		HashTable h = new HashTable(10);
		int[] keys = {5,34,12,9,54,1};

		for(int i : keys)
		{
			h.insertKey(i);
		}
		h.display();
	}//end of main
}//end of HashTable
