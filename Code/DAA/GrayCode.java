import java.util.*;

class GrayCode 
{
    public List<Integer> grayCode(int n) 
	{
		//logic
		ArrayList<Integer> b=new ArrayList<>();
		b.add(0);
		if(n==0)
		    return b;
		b.add(1);
		int v=1;
		for(int i=2;i<=n;i++)
		{
		    v=v*2;
		    for(int j=b.size()-1;j>=0;j--)
		    {
		        b.add(v+b.get(j));
		    }
		}
		return b;
	}
	public static void main( String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        sc.close();
		System.out.println(new GrayCode().grayCode(N));
	}
}