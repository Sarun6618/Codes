import java.util.*;

class UniquePatterns 
{
    int m,n;
	int baserow,basecol;
	
    public int numUniquePatterns(int[][] a) 
	{
        m=a.length;
		n=a[0].length;
		Set<String> shapes=new HashSet<>();
		
		//logic
		for(int row=0;row<m;row++)
		{
		    for(int col=0;col<n;col++)
		    {
		        if(a[row][col]==0)
		        continue;
		        baserow=row;
		        basecol=col;
		        StringBuilder sb=new StringBuilder();
		        path(a,row,col,sb);
		        shapes.add(sb.toString());
		    }
		}
		return shapes.size();
    }
	public void path(int a[][],int row,int col,StringBuilder sb)
	{
		//logic
		if(row<0 || col<0 || row>=a.length || col>=a[0].length || a[row][col]==0)
		return;
		sb.append(row-baserow);
		sb.append(col-basecol);
		sb.append(",");
		a[row][col]=0;
		path(a,row-1,col,sb);
		path(a,row,col+1,sb);
		path(a,row,col-1,sb);
		path(a,row+1,col,sb);
	}
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of the grid");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Enter the island values");
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
        sc.close();
		System.out.println(new UniquePatterns().numUniquePatterns(a));
	}
}