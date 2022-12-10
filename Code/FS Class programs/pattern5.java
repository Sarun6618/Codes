/* Write a java program to print following pattern.
input=5
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

**/
import java.util.*;
class pattern5
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),sp=n;
        int i,j,k,ct=(n-1);
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j+ct);
            }
            for(j=j-2;j>=1;j--)
            {
                System.out.print(j+ct);
            }
            ct--;
            sp--;
            System.out.println();
        }
        s.close();
    }
}