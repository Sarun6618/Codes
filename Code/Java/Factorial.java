//Java Program to Find Factorial of a NumberL-1
import java.util.Scanner;
public class Factorial
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    in.close();
    }
}