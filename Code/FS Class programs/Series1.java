//Program to find the sum of the following series 1+x+x^2+x^3+x^4+x^5+......
import java.util.*;
class Series1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter x and n");
        //logic
        int x=s.nextInt();
        int n=s.nextInt();
        s.close();
        double sum=1;
        for(int i=1;i<=n;i++)
        {
            sum+=Math.pow(x,i);
        }
        System.out.println("Sum is "+sum);
    }
}
/*
Enter x and n
2 8
Sum is 511.0
*/
