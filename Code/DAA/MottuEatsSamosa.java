import java.util.*;
class MottuEatsSamosa
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int h=sc.nextInt();
        int []nums=new int[s.length];
        for(int i=0;i<s.length;i++)
        {
            nums[i]=Integer.parseInt(s[i]);
        }
        sc.close();
        System.out.println(banana(nums,h));
    }
    static int banana(int []nums,int h)
    {
        int n=1;
        int t=nums[nums.length-1];
        while(t>h)
        {
            for(int i=0;i<nums.length;i++)
            {
                for(int j=0;j<=(int)Math.ceil((nums[i]*1.0)/n);j++)
                {
                    t=t+1;
                }
                n++;
            }
            if(t<=h)
            {
                break;
            }
        }
        return n;
    }
}
                          
              
                            