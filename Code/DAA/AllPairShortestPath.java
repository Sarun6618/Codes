import java.util.*;
class AllPairShortestPath
{
	static int INF = 999,V;
	void floydWarshall(int graph[][])
	{
		int dist[][] = new int[V][V];
		int i, j, k;
		for(i=0;i<V;i++)
		{
		    for(j=0;j<V;j++)
		    {
		        dist[i][j]=graph[i][j];
		    }
		}
		// store graph values in dist

		//logic
		for(k=0;k<V;k++)
		{
		    for(i=0;i<V;i++)
		    {
		        for(j=0;j<V;j++)
		        {
		            dist[i][j]=Math.min(dist[i][j],graph[i][k]+graph[k][j]);
		        }
		    }
		}
		// Print the shortest distance matrix
		printSolution(dist);
	}

	void printSolution(int dist[][])
	{
		System.out.println("The following matrix shows the shortest distances between every pair of vertices");
		for (int i=0; i<V; ++i)
		{
			for (int j=0; j<V; ++j)
			{
				if (dist[i][j]==INF)
					System.out.print("INF ");
				else
					System.out.print(dist[i][j]+" ");
			}
			System.out.println();
		}
	}

	// Driver program to test above function
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of vertices");
		V=s.nextInt();
		int graph[][] = new int[V][V];
		System.out.println("Enter edge with costs");
		//read values
		for(int i=0;i<V;i++)
		{
		    for(int j=0;j<V;j++)
		    {
		        graph[i][j]=s.nextInt();
		    }
		}
        s.close();
		AllPairShortestPath a = new AllPairShortestPath();
		// Print the solution
		a.floydWarshall(graph);
	}
}
