import java.util.*;
public class GetMaximumGold 
{
  static int max=0;
  public static void getMaxGold(int a[][],int i,int j, boolean visited[][], ArrayList<Integer> bag)
  {
    //logic
    if(i<0 || i>=a.length || j<0 || j>=a[i].length || visited[i][j]==true || a[i][j]==0)
    {
        return;
    }
    bag.add(a[i][j]);
    visited[i][j]=true;
    getMaxGold(a,i-1,j,visited,bag);
    getMaxGold(a,i,j+1,visited,bag);
    getMaxGold(a,i,j-1,visited,bag);
    getMaxGold(a,i+1,j,visited,bag);
   }
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of rows and columns");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter the matrix");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
        sc.close();
        boolean visited[][]=new boolean[m][n];
         
		//logic
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(a[i][j]!=0 && visited[i][j]==false)
		        {
		            ArrayList<Integer>bag=new ArrayList<>();
		            getMaxGold(a,i,j,visited,bag);
		            int sum=0;
		            for(int x:bag)
		            {
		                sum=sum+x;
		            }
		            if(sum>max)
		            max=sum;
		        }
		    }
		}
        System.out.println(max);
    }
}

