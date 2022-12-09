/*Write a Java program to print the Largest digit of a given positive number.
Sample 1:
input = 12534
output = 5
Sample 2:
input = 100
output = 1
*/
import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt(),l=0;
        while(n>0)
        {
            int f=n%10;
            l=Math.max(f,l);
            n/=10;
        }
        System.out.println(l);
        r.close();
    }
}