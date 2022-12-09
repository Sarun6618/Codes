import java.util.*; 
class Kruskals
{
 	static int v;
	static int parent[];
	 
	// Find set of vertex i
	static int find(int i)
	{
	    while(parent[i]!=-1){
	        i=parent[i];
	    }
	    return i;
	    //logic
	}
	 
	// Does union of i and j. It returns false if i and j are 
	// already in same set.
	static void union(int i, int j)
	{
	    int k=find(i);
	    int l=find(j);
	    parent[k]=l;
		//logic
	}
	 
	// Finds MST using Kruskal's algorithm
	static void kruskalMST(int cost[][])
	{
		int mincost = 0; // Cost of min MST.
		for(int i=1;i<=v;i++){
		    parent[i]=-1;
		}
	 
		// Initialize sets of disjoint sets.
	//logic
	 
		// Include minimum weight edges one by one
		int edge_count=1;
		while(edge_count<v){
		//logic
		    int min=Integer.MAX_VALUE,x=-1,y=-1;
		    for(int i=1;i<=v;i++){
		        for(int j=1;j<=v;j++){
		            if(find(i)!=find(j) && min>cost[i][j]){
		                min=cost[i][j];
		                x=i;
		                y=j;
		            }
		        }
		    }
		    union(x,y);
			System.out.printf("Edge %d:(%d, %d) cost:%d \n",edge_count++, x, y, min);
			mincost += min;
		}
		System.out.printf("\n Minimum cost= %d \n", mincost);
	}
	 
	// Driver code
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		v=s.nextInt();
		parent=new int[v+1];
		int cost[][] = new int[v+1][v+1];
		System.out.println("Enter cost adjacency matrix");
		for(int i=1;i<=v;i++)
		{
			for(int j=1;j<=v;j++)
			{
				cost[i][j]=s.nextInt();
			}
		}
        s.close();
	 	// Print the solution
		kruskalMST(cost);
	}
}