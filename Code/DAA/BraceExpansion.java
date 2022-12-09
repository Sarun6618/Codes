import java.util.*;
class BraceExpansion 
{
	public static List<String> getAllExpansions(String s) 
	{
        List<String> res = new ArrayList<>();
        dfs(s, 0, "", res);
        return res;
    }

    private static void dfs(String s, int start, String cur, List<String> res) 
	{
        //logic
        if(start==s.length())
        {
            res.add(cur);
            return;
        }
        int left=s.indexOf("{",start);
        int right=s.indexOf("}",start);
        if(left==-1)
        {
            res.add(cur+s.substring(start));
            return;
        }
        String sub=s.substring(left+1,right);
        String strs[]=sub.split(",");
        for(int i=0;i<strs.length;i++)
        {
            dfs(s,right+1,cur+s.substring(start,left)+strs[i],res);
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an expression");
		String s=sc.next();
        sc.close();
		System.out.println(getAllExpansions(s));
	}
}
