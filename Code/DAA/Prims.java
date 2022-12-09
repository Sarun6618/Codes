import java.util.*;
class Prims 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of vertices");
		// declare n and read
		//declare a[][] with n+1 size
		int n=sc.nextInt();
		int cost[][]=new int[n+1][n+1];
		//int i=0,j=0,mc=0;
		System.out.println("Enter the weighted adjacency matrix");
		//logic
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		        cost[i][j]=sc.nextInt();
		    }
		}
		sc.close();
		int min=Integer.MAX_VALUE,k=0,l=0,mincost=0;
		//find the minimum cost edge
		//mc=a[k][l];
		int near[]=new int[n+1];
		int t[][]=new int[n][3];
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		        if(min>cost[i][j])
		        {
		            min=cost[i][j];
		            k=i;
		            l=j;
		        }
		    }
		}
		for(int i=1;i<=n;i++)
		{
		    if(cost[i][l]<cost[i][k])
		        near[i]=l;
		    else
		        near[i]=k;
		        
		}
			t[1][1]=k;
			t[1][2]=l;
		//update near[]	
		mincost=cost[k][l];
		near[k]=0;
		near[l]=0;
        for(int i=2;i<n;i++)
        {
            min=Integer.MAX_VALUE;
            for(l=1;l<=n;l++)
            {
                if(near[l]!=0 && min>cost[l][near[l]])
                {
                    min=cost[l][near[l]];
                    k=l;
                }
            }
            t[i][1]=k;
            t[i][2]=near[k];
            mincost+=cost[k][near[k]];
            near[k]=0;
            for(int j=1;j<=n;j++)
            {
                if(near[j]!=0 && (cost[j][near[j]]>cost[j][k]))
                    near[j]=k;
            }
        }
		System.out.println(mincost);		
	}
}
