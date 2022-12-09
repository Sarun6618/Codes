/*Write a Java program to print following pattern
input=5
output=
55555
54444
54333
54322
54321
*/
import java.util.*;
class Task2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>=1;j--)
            {
                if((i+j)>n)
                System.out.print(j);
                else
                System.out.print(n-i);
            }
            System.out.println();
        }
        s.close();
    }
}