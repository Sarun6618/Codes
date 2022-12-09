/* Write a Java program to print following pattern
input=5
output=
 ####
# ###
## ##
### #
####
*/
import java.util.*;
class pattern4
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==j)
                System.out.print(" ");
                else
                System.out.print("#");
            }
            System.out.println();
        }
        s.close();
    }
}