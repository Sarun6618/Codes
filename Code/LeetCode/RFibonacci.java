import java.util.*;
class RFibonacci {
    public static int fib(int n)
    {
        if(n<2)
        return n;
        else
        return fib(n-1)+fib(n-2);
    }     
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        System.out.println(fib(n));
        r.close();
    }
}
