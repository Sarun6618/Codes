import java.util.*;

class GrayCodes 
{
    public ArrayList<String> grayCode(int n) 
	{
		//logic
		if(n==1)
		{
		    ArrayList<String> b=new ArrayList<>();
		    b.add("0");
		    b.add("1");
		    return b;
		}
		ArrayList<String> rr=grayCode(n-1);
		ArrayList<String> mr=new ArrayList<>();
		for(int i=0;i<rr.size();i++)
		{
		    mr.add("0"+rr.get(i));
		}
		for(int i=rr.size()-1;i>=0;i--)
		{
		    mr.add("1"+rr.get(i));
		}
		return mr;
	}

	public static void main( String args[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        sc.close();
		System.out.println(new GrayCodes().grayCode(N));
	}
}