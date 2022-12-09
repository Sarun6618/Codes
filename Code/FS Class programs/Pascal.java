import java.util.*;
class Pascal
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=s.nextInt();
        int i,j,k,sp=r,num;
        //logic
        for(i=0;i<sp;i++)
        {
            for(k=sp;k>i;k--)
            {
                System.out.print(" ");
            }
            num=1;
            for(j=0;j<=i;j++)
            {
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}