//Given the ages of 3 students print the youngest and smallest ages
import java.util.*;
public class YO
{
  public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      //read 3 values
      int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
      if(c>b & b>a)
      {
        System.out.println("Youngest="+a+"  "+"Oldest="+c);
      }
      else if(b>c & c>a)
      {
        System.out.println("Youngest="+a+"  "+"Oldest="+b);
      }
      else if(c>a & a>b)
      {
        System.out.println("Youngest="+b+"  "+"Oldest="+c);
      }
      else if(a>c & c>b)
      {
        System.out.println("Youngest="+b+"  "+"Largets="+a);
      }
      else if(b>a & a>c)
      {
        System.out.println("Youngest="+c+"  "+"Oldest="+b);
      }
      else
      {
        System.out.println("Youngest="+c+"  "+"Oldest="+a);
      }
      s.close();
    }
}