/*Write a Java program to print following pattern
input=6
output=
o
oo
o o
o  o
o   o
oooooo
*/
import java.util.*;
class Task9
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i || i==n)
                System.out.print("o");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        s.close();
    }
}