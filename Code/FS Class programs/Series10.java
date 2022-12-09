//Program to find the sum of the following series x+x^3/3!+x^5/5!+x^7/7!+......
import java.util.*;
class Series10
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter x and n");
        int x=s.nextInt();
        double n=s.nextInt();
        s.close();
        double sum=0;
        //logic
        for(int i=1;i<=n;i+=2)
        {
            int f=1;
            for(int j=1;j<=i;j++)
            {
                f=f*j;
            }
            sum+=((Math.pow(x,i))/f);
        }
        System.out.println("Sum is "+sum);
    }
}
/*
Enter x and n
3 9
Sum is 10.013169642857143
*/