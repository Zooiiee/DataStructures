import java.util.Scanner;

public class AdjMat
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	
		//Input Vertices
		System.out.print("Enter the Number of Vertices : ");
		int v = scan.nextInt();
	
		//Create Matrix
		int[][] mat = new int[v][v];

		//Input edges
		System.out.print("Enter the Number of Edges : ");
		int e = scan.nextInt();
		
		//Read Edges
		System.out.println("Enter the Edge(Source/Destination): ");
		for(int i=1;i<=e;i++)
		{
			int source = scan.nextInt();
			int dest = scan.nextInt();
		
			mat[source][dest]=1;
			mat[dest][source]=1;
		}
		
		//Display
		System.out.println("\nGraph Representation using Adjacency Matrix : ");
		for(int i=0 ; i<v ; i++)
		{
			for(int j=0 ; j<v ; j++)
			{
				System.out.print(mat[i][j]+"  ");

			}
			System.out.println();
		}

		
	}//end of main

}//end of AdMat

