import java.util.*;
class Exam4q
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter order of first matrix");
        int r=s.nextInt();
        int c=s.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
        s.close();
    }
    static int dia(int a[][],int r,int c)
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int sum=0;
                while(a[i][j]==a[i+1][j+1])
                {
                    sum+=1;
                }
                return sum;
            }
        }
        return 0;
    }
}