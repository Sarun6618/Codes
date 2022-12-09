/*Write a Java program to print following pattern
input=5
output=
1
3 1
5 3 1
7 5 3 1
9 7 5 3 1
*/
import java.util.*;
class Task5
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a=2*i-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a-=2;
            }
            System.out.println();
        }
        s.close();
    }
}
