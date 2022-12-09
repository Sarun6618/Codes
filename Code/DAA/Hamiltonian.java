import java.util.*;
import java.io.*;
public class Hamiltonian
{
	static boolean found = false;
	public static void main(String args[]) throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Hamiltonian Cycle");
		System.out.println("\nEnter the number of the vertices:");
		int n = s.nextInt();
		int G[][] =new int[n+1][n+1];
		int x[] =new int[n+1];
		System.out.println("Enter adjacency matrix");
		//logic
		for(int i=1;i<n+1;i++)
		{
		    for(int j=1;j<n+1;j++)
		    {
		        G[i][j]=s.nextInt();
		    }
		}
        s.close();

		for(int i=1;i<=n;i++)
		{
			x[i] = 0;
		}
		x[1] = 1;
		System.out.println("\nSolution:");
		Hamiltonians(2,G,x,n);
		if(found == false)
			System.out.println("No Solution possible!");
	}

	static void Hamiltonians(int k,int G[][],int x[],int n)
	{
		while(true)
		{
			//logic
			NextValue(k,G,x,n);
			if(x[k]==0)
			   return;
			if(k == n)
			{
				for(int i=1; i<=k;i++)
					System.out.print(x[i]+" ");
				System.out.println();
				found = true;
				return;
			}
			else{
			    Hamiltonians(k+1,G,x,n);
			}
		}
	}
	static void NextValue(int k,int G[][],int x[],int n)
	{
	    //logic
	    int j;
	    while(true)
	    {
	        x[k]=(x[k]+1)%(n+1);
	        if(x[k]==0)
	        {
	          return;
	        }
	        if(G[x[k-1]][x[k]]!=0)
	        {
	            for(j=1;j<=k-1;j++)
	            {
	                if(x[j]==x[k])
	                   break;
	            }
	                if(j==k)
	                {
	                    if((k<n) || (((k==n) && (G[x[k]][x[1]]!=0)))){
	                        return;
	                    }
	                }
	        }
	    }
	}
}