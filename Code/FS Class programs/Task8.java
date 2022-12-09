/*Write a Java program to print following pattern
input=7
output=
ooooooo
oo   oo
o o o o
o  o  o
o o o o
oo   oo
ooooooo
*/
import java.util.*;
class Task8
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i==1||i==n)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("o");
                }
            }
            if(i>=2 && i<=(n-1))
            {
                for(int j=1;j<=n;j++)
                {
                    if(j==1 || j==n || j==i || j==(n-i+1))
                    System.out.print("o");
                    else if(j>1&& j<n)
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}