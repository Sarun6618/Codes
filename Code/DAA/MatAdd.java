import java.util.*;
class MatAdd
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter order of first matrix");
        int r1=s.nextInt();
        int c1=s.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter order of second matrix");
        int r2=s.nextInt();
        int c2=s.nextInt();
        int b[][]=new int[r2][c2];
        if(r1==r2 && c1==c2)
        {
            System.out.println("Enter first matrix");
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("Enter second matrix");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    b[i][j]=s.nextInt();
                }
            }
            int c[][]=new int[r2][c2];
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("Sum of the matrices is");
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    System.out.println(c[i][j]+" ");
                }
                System.out.println();
            }
            s.close();
        }
        else
        {
            System.out.println("Addition not possible");
        }
    }
}  
