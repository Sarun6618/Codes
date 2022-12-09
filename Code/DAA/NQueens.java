import java.util.*;
class NQueens
{
	int x[]=new int[20];
	public boolean place(int k,int i)
	{
		int j;
		//logic
		for(j=1;j<=k-1;j++)
		{
		    if((x[j]==i) || (Math.abs(j-k)==(Math.abs(x[j]-i))))
		    return false;
		}
		return true;
	}

	public void queen(int k,int n)
	{
		int i;
		for(i=1;i<=n;i++)
		{
			if(place(k,i))
			{
				//logic
				x[k]=i;
				if(k==n)
				{
					for(int l=1;l<=n;l++)
					{
						System.out.print(" "+x[l]);
					}
					System.out.println();
				}
				else //try next queen with next position
				//logic
				queen(k+1,n);
			}
		}
	}
	public static void main (String args[] )
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no Of Queens");
		int n=s.nextInt();
        s.close();
		NQueens nq=new NQueens();
		nq.queen(1,n);
	}
}
