import java.util.*;

class ValidAbbreviation 
{
    public boolean validity(String word, String abbr) 
	{
		//logic
		if(word==null||abbr==null)
		return false;
		int i=0,j=0;
		while(i<word.length()&&j<abbr.length())
		{
		    if(Character.isDigit(abbr.charAt(j)))
		    {
		        if(abbr.charAt(j)==0)
		        return false;
		        int t=0;
		        while(j<abbr.length()&&Character.isDigit(abbr.charAt(j)))
		        {
		            t=t*10+(abbr.charAt(j)-'0');
		            j++;
		        }
		        i+=t;
		    }
		    else
		    {
		        if(word.charAt(i)!=abbr.charAt(j))
		        {
		            return false;
		        }
		    }
		    i++;j++;
		}
		return i==word.length()&&j==abbr.length();
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word");
		String word=sc.next();
		System.out.println("Enter abbreviation");
		String abbr=sc.next();
        sc.close();
		System.out.println(new ValidAbbreviation().validity(word,abbr));
	}
}