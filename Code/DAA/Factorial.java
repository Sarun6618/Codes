import java.util.*;
class Factorial
{
    static long fact(int n)
    {
        if(n==0)
        return 1;
        else
        return(n*fact(n-1));
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        s.close();
        System.out.println("Factorial is "+fact(n));
    }
}