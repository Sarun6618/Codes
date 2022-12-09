import java.util.*;
class GeneralizedAbbreviations 
{
	public static void abbreviate(String s,String op, int count,int pos)
	{
		if(pos==s.length())
		{
			if(count==0)
				System.out.println(op);
			else
				System.out.println(op+count);
			return;
		}
		
		//logic
		abbreviate(s,op,count+1,pos+1);
		
		if(count>0)
			//logic
			abbreviate(s,op+count+s.charAt(pos),0,pos+1);
		else
			//logic
			abbreviate(s,op+s.charAt(pos),0,pos+1);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		String str=s.next();
        s.close();
		abbreviate(str," ",0,0);
	}
}
