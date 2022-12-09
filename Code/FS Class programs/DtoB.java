import java.util.*;
class DtoB
{
    public static void main(String[] args)
    {
        //logic
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b[]=new int[40];
        int in=0;
        while(n>0)
        {
            b[in++]=n%2;
            n=n/2;
        }
        for(int i=in-1;i>=0;i--)
        {
            System.out.print(b[i]);
        }
        s.close();
    }
}
/*
input=25
output=11001
input=125
*/