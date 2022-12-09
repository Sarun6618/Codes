//Program to find the sum of the following series 1-x+x^2-x^3+x^4-x^5+......
import java.util.*;
class Series2
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter x and n");
        //logic
        int x=s.nextInt(),n=s.nextInt();
        s.close();
        double sum=1;
        for(int i=1,t=1;i<=n;i++)
        {
            sum+=(Math.pow(x,i))*(-t);
            t=t*(-1);
        }
        System.out.println("Sum is "+sum);
    }
}
/*
Enter x and n
4 10
Sum is 838861.0
*/