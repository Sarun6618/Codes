/*a.Given a number,check*/
import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==((j+1)*j))
                {
                    System.out.println(i);
                }
            }
        }
        in.close();
    }
}