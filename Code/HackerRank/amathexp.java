import java.util.*;

public class amathexp 
{
    public static void main(String[] args) 
    {
       Scanner r=new Scanner(System.in);
       int q=r.nextInt();
       for(int i=0;i<q;i++)
       {
           int a=r.nextInt(),b=r.nextInt(),n=r.nextInt();
           int cal=a;
           for(int j=0;j<n;j++)
           {
               cal+=(Math.pow(2,j)*b);
               System.out.print(cal+" ");
           }
           System.out.println();
       }
       r.close();
    }
}
