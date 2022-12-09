import java.util.*;
class ClimbingStairs 
{
    public static int climbStairs(int n) 
    {
        //declare a new array of size n+1 
        int [] s=new int[n+1];
        return stairs(n, s);
    }
    public static int stairs(int n, int s[]) 
    {
        //logic
        if(n<=2){
            return n;
        }
        else if(s[n]>0){
            return s[n];
        }
        s[n]=climbStairs(n-1)+climbStairs(n-2);
        return s[n];
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of steps");
        int n=sc.nextInt();     
        System.out.println(climbStairs(n));
        sc.close();
    }
}