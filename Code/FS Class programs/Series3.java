//Program to find the sum of the following series 1-x^2/2!+x^4/4!-x^6/6!+....
import java.util.*;
class Series3
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter x and n");
        //logic
        int x=s.nextInt(),n=s.nextInt();
        s.close();
        double sum=0;
        for(int i=0,t=1;i<=n;i+=2)
        {
            int f=1;
            for(int j=1;j<=i;j++)
            {
                f=f*j;
            }
            sum+=((Math.pow(x,i))/f)*t;
            t=t*(-1);
        }
        System.out.println("Sum is "+sum);
    }
}
/*
Enter x and n
3 7
Sum is -1.1375
*/
