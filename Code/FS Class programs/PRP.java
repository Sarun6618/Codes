//A number is called primepal if it is both prime number and palindrome number. Given a number check whether a number is both prime number and palindrome
import java.util.*;
class PRP
{
    public static void main(String[] args)
    {
        //logic
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        r.close();
        for(int k=n;;k++)
        {
            int flag=0;
            for(int i=2;i<=k/2;i++)
            {
                if(k%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                int x=k,sum=0,a;
                while(x>0)
                {
                    a=x%10;
                    sum=(sum*10)+a;
                    x/=10;
                }
                if(sum==k)
                {
                    System.out.println("True");
                    break;
                }
                else
                {
                    System.out.println("False");
                    break;
                }
            }
        }
    }
}
/*
     input=181
     output=True

     input=171
     output=False
*/
