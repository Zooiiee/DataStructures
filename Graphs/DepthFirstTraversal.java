public class DepthFirstTraversal
{	
	private int[][] adj;	//Adjacency Matrix for the graph
	private boolean[] visited;	//Vector to track visited nodes
	private int[] stack;
	private int tos;
	
	//Constructor
	public DepthFirstTraversal(int v)
	{
		adj = new int[v][v];
		visited = new boolean[v];	
		stack = new int[v];
		tos =-1;
	}

	//Add Edge
	public void addEdge(int src, int dest)
	{
		adj[src][dest] = 1;
		adj[dest][src] = 1;
	}//end of addEdge
	
	//Depth First Traversal
	public void performDFT(int x)
	{
		push(x);	//push the starting node onto the stack	
		System.out.println("Depth First Traversal : ");

		while(tos !=-1)
		{
			int curr = pop();
			if(!visited[curr])
			{
				visited[curr] = true;
				System.out.print(curr+"  ");
				
				//push all unvisited adjacent nodes into the stack
				for(int i = adj.length-1 ; i>=0; i--)
				{
					if(adj[curr][i]==1 && !visited[i])
					{
						push(i);
					}
				}//end of for
			}//end of if
		}//end of while
	}//end of performDFT

	//push
	private void push(int node)
	{
		tos++;
		stack[tos] = node;
	}

	//pop
	private int pop()
	{
		int temp = stack[tos];
		tos--;
		return temp;
	}

	//main
	public static void main(String[] args)
	{
		DepthFirstTraversal g = new DepthFirstTraversal(5);
		//Add Edges
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,4);
		g.performDFT(0);	//DFT starting from vertex 0
	}//end of main
}//end of DFT
