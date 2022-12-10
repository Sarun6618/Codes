//Krishna was given a number and was asked to check whether it has even number of digits, then was asked to divide into 2 equal halves, then add the 2 halves and square the value. Check whether the squared value is equal to original number or not. Help him in writing the code
import java.util.*;
class Tech
{
   public static void main(String[] args)
   {
      Scanner s =  new Scanner(System.in);
      System.out.print("Enter an integer number:: ");
      int n = s.nextInt();
      s.close();
      int x=n,ct = 0,fh = 0,lh = 0,sum = 0;
      // count number of digits
      while(n>0)
      {
          ct++;
          n/=10;
      }
      if(n%2!=0)
      {
       System.out.println(x+" is not a tech number");
       return;
      }
      //find fh and lh
      fh=x/(int)Math.pow(10,ct/2);
      lh=x%(int)Math.pow(10,ct/2);
      sum = fh + lh;
      if((sum*sum)==x)
      System.out.println(x+" is a tech number");
      else
      System.out.println(x+" is not a tech number");
    }
}
