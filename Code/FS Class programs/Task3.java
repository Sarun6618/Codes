/*Write a Java program to print following pattern
input=5
output=
10101
01010
10101
01010
10101
*/
import java.util.*;
class Task3
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ct=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(ct%2==0)
                System.out.print("0");
                else
                System.out.print("1");
                ct++;
            }
            System.out.println();
        }
        s.close();
    }
}