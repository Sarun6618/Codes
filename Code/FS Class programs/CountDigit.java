/*Write a Java program to accept a number from user and count zero, odd and even digits
of the entered number.
Sample input/output:
Input=12045067
Output=Zero: 2
Even: 3
Odd: 3
*/
import java.util.*;
class CountDigit
{
    public static void main(String args[])
    {
    Scanner r=new Scanner(System.in);
    int n=r.nextInt(),e=0,o=0,z=0;
    r.close();
    while(n>0)
    {
        int l=n%10;
        if(l%2==0 && l!=0)
            e++;
        if(l==0)
            z++;
        if(l%2==1 && l!=0)
            o++;
        n=n/10;
    }
    System.out.println("Zero: "+z+"\nEven: "+e+"\nOdd: "+o);
    }
}
