/* Write a Java program to print following pattern
input=5
output=
#####
#   #
#   #
#   #
#####
*/
import java.util.*;
class Task7
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print('#');
                }
                System.out.println();
            }
            if(i>=2 && i<=(n-1))
            {
                for(int j=1;j<=n;j++)
                {
                    if(j==1 || j==n)
                    {
                        System.out.print('#');
                    }
                    else if(j>1 && j<n)
                    {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        s.close();
    }
}