import java.util.*;
class OutputFormat
{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s=r.next();int I=r.nextInt();
            System.out.printf("%-15s%03d\n",s,I);
        }
        r.close();
        System.out.println("================================");
    }
}