import java.util.*;
class rough{

	 static void loopInRoadmap(int graph[][])
	{
		//Implement your logic here.
		int m=0;
		for(int i=0;i<graph.length;i++)
		{
		    for(int j=0;j<graph[i].length;j++)
		    {
		        if(graph[i][j]==1)
		        {
		            m=Math.max(m,path(graph,i,j));
		        }
		    }
		}
		System.out.println(m);
	}
	static int path(int graph[][],int i,int j)
	{
	    if(i<0||j<0||i>=graph.length||j>=graph[i].length||graph[i][j]==0)
	    return 0;
	    graph[i][j]=0;
	    int ct=1;
	    ct+=path(graph,i-1,j);
	    ct+=path(graph,i,j+1);
	    ct+=path(graph,i,j-1);
	    ct+=path(graph,i+1,j);
	    return ct;
	}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.println(a[i][j]);
		    }
		}
    }
}