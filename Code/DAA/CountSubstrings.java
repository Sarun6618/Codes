import java.util.*;

class CountSubstrings 
{
    public int countLetters(String s) 
	{
		//logic
		int ct=0,i=0,j=0,n=s.length();
		while(i<n && j<n)
		{
		    while(j+1<n && s.charAt(j)==s.charAt(j+1))
		    {
		        j++;
		    }
		    ct+=(j-i+1)*((j-i+1)+1)/2;
		    i=j+1;
		    j=i;
		}
		return ct;
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
        sc.close();
		System.out.println(new CountSubstrings().countLetters(s));
	}
}