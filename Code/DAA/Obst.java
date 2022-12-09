import java.util.*;
class Obst
{
	void obst(int p[],int q[],int n)
	{
		int c[][]=new int[n+1][n+1];
		int w[][]=new int[n+1][n+1];
		int r[][]=new int[n+1][n+1];

		//logic
		for(int i=0;i<=n-1;i++)
		{
		    w[i][i]=q[i];
		    c[i][i]=0;
		    r[i][i]=0;
		    w[i][i+1]=p[i+1]+q[i+1]+w[i][i];
		    c[i][i+1]=p[i+1]+q[i+1]+w[i][i];
		    r[i][i+1]=i+1;
		}
		w[n][n]=q[n];
		c[n][n]=0;
		r[n][n]=0;
		for(int m=2;m<=n;m++)
		{
		    for(int i=0;i<=n-m;i++)
		    {
		       int j=i+m;
		        w[i][j]=p[j]+q[j]+w[i][j-1];
               int k=find(c,i,j);
		        c[i][j]=c[i][k-1]+c[k][j]+w[i][j];
		        r[i][j]=k;
		    }
		}
		System.out.println(r[0][n]+"	"+c[0][n]+"	"+w[0][n]);
	}

	int find(int c[][],int i,int j)
	{
		int min=Integer.MAX_VALUE;
		int l=0;
		//logic
		for(int k=i+1;k<=j;k++)
		{
		    if(c[i][k-1]+c[k][j]<min)
		    {
		        min=c[i][k-1]+c[k][j];
		        l=k;
		    }
		}
		return l;
	}
	public static void main(String[] args) 
	{
	    
		Scanner s=new Scanner(System.in);
        s.close();
		int p[]=new int[]{0,3,3,1,1};
		int q[]=new int[]{2,3,1,1,1};
		new Obst().obst(p,q,4);
	}
}