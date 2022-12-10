/* Write a java program to print following pattern.
input=5
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

**/
import java.util.*;
class pattern6
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            System.out.print(" ");
            for(int j=i;j>=1;j--)
            System.out.print(j+" ");
            for(int j=2;j<=i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        s.close();
    }
}