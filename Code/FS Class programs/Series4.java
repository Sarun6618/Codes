//Program to find the sum of the following series x-x^3/3!+x^5/5!-x^7/7!+......
import java.util.*;
class Series4
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter x and n");
        //logic
        double x=s.nextInt(),n=s.nextInt(),sum=0;
        s.close();
        for(int i=1,t=1;i<=n;i+=2)
        {
            int f=1;
            for(int j=1;j<=i;j++)
            {
                f=f*j;
            }
            sum+=(Math.pow(x,i)/f)*t;
            t=t*-1;
        }
        System.out.println("Sum is "+sum);
    }
}
/*
Enter x and n
4 7
Sum is -1.3841269841269837
*/