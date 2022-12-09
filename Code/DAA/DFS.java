import java.util.*;
class DFS 
{
	static int n;
	static int visited[];
	void dfs(int a[][],int v)
	{
		//logic
		visited[v]=1;
		System.out.print(v+" ");
		//logic
		for(int i=1;i<a.length;i++)
		{
		    if(a[v][i]==1 && visited[i]==0)
		    dfs(a,i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		n=s.nextInt();
		int a[][]=new int[n+1][n+1];
		visited=new int[n+1];
        System.out.println("Enter the adjacency matrix of the graph");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		s.close();
		System.out.println("Enter source vertex");
		int v=s.nextInt();
		new DFS().dfs(a,v);		
	}
}
