public class BreadthFirstTraversal
{
	private int[][] adj;	//Adjacency Matrix for the graph
	private boolean[] visited;	//Track visited nodes
	private int[] queue;
	private int front, rear;

	//constructor
	public BreadthFirstTraversal(int v)
	{
		adj = new int[v][v];
		visited =  new boolean[v];
		queue =  new int[v];
		front =-1;
		rear -=1;
	}
	
	//add edge
	public void addEdge(int src, int dest)
	{
		adj[src][dest] = 1;
		adj[dest][src] = 1;
	}//end of addEdge

	//BFT Traversal
	public void performBFT(int x)
	{
		enqueue(x);	//Enqueue Starting node
		visited[x] = true;
		
		System.out.println("Breadth First Traversal :");
		while(front != -1)
		{
			int curr = dequeue();
			System.out.print(curr+" ");

			//Enqueue all unvisited nbrs & set their value to true
			for(int i=0; i<adj.length ; i++)
			{
				if(adj[curr][i]==1 && !visited[i])
				{
					enqueue(i);
					visited[i]=true;
				}	
			}
		}//end of while
	}//end of performBFT

	//Enqueue
	private void enqueue(int node)
	{
		if(front==-1)
		{
			front++;
		}
		rear++;
		queue[rear] = node;
	}//end of enqueue

	//Dequeue
	private int dequeue()
	{
		int temp = queue[front];
		if(front==rear)
		{
			front =-1;
			rear=-1;
		}
		else
		{
			front++;
		}
		return temp;
	}//end of dequeue
	
	//main
	public static void main(String[] args)
	{
		BreadthFirstTraversal g = new BreadthFirstTraversal(5);
		//Add Edges
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,4);
		g.performBFT(0);	//BFT from Node 0
	}//end of main
}//end of BFT
