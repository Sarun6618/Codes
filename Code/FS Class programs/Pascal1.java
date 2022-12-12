import java.util.*;
class Pascal1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[10];
        int b[]=new int[10];
        //int sp=10;
        System.out.println("Enter number of rows (less than 10)");
        int r=s.nextInt();
        int sp=r;
        //logic
        b[0]=1;
        a[0]=1;
        int i,j,k,l;
        System.out.println("1");
        for(i=1;i<=sp;i++)
        {
            for(j=0;j<i;j++)
            System.out.print("");
            for(k=1;k<sp;k++)
            a[k]=b[k-1]+b[k];
            a[i]=1;
            for(l=0;l<=i;l++)
            {
                System.out.print(a[l]+" ");
                b[l]=a[l];
            }
            System.out.println("");
        }
        s.close();
    }
}