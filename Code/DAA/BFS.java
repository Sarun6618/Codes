import java.util.*;
class BFS 
{
	int q[]=new int[20];
	int f=-1,r=-1;

	void qinsert(int x)
	{
	    //logic
	    r++;
	    q[r]=x;
	    if(f==-1)
	      f=0;
	}

	int qdelete(int x)
	{
		//logic
		if(f==-1){
		  return 0;
		}
		x=q[f];
		if(f==r){
		  f=r=-1;
		}
		else{
		  f++;
		}
		return x;
	}

	void bfs(int a[][],int v)
	{
		int n=a.length;
		int visited[]=new int[a.length];
		
		  //inserting the source vertex into the queue
	 //indicating that it has been visited
	     visited[v]=1;
	     qinsert(v);

	  //storing the value of source vertex into u
	  int u=v;

		while(true)
		{
			for(int i=1;i<n;i++)
			{  
			//identify the adjacent vertices of vertex u and if they 			//are not visited add them 
			//to q and make their visted as 1 so that it is not 			//added to queue 2nd time
			if(a[u][i]==1 & visited[i]==0)
			{
			    qinsert(i);
			    visited[i]=1;
			}
			
			}
		  //delete the front element(vertex) of 						//the queue 
			 //if queue is not empty
				int x=qdelete(n);
				if(x!=0)
				System.out.print(" "+x);  //print the vertex to 							//indicate it is traverses
			  //if queue is empty
			  if(f==-1)
			      break;
				 //traversal is complete
		  //make the next front element of the queue as u 					//and complete its traversal
		  u=q[f];
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int n=s.nextInt();
		int a[][]=new int[n+1][n+1]; 		
		System.out.println("Enter the adjacency matrix of the graph");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter source vertex");
		int v=s.nextInt();
		new BFS().bfs(a,v);		
	}
}