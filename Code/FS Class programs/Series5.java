//Program to find the sum of the following series 1+(1+3)+(1+3+5)+.......
import java.util.*;
class Series5
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();
        s.close();
        int sum = 0;
        //logic
        for(int i=1;i<=n;i++)
        {
            int k=1;
            for(int j=1;j<=i;j++)
            {
                sum+=k;
                k+=2;
            }
        }
        System.out.println("Sum is "+sum);
    }
}
/*
Enter n
8
Sum is 204
*/
