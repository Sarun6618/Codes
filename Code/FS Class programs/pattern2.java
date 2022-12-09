class pattern2
{
    public static void main(String args[])
    {
        int i,j,k,sp=5;
        for(i=1;i<=5;i++)
        {
            for(k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(j=j-2;j>=1;j--)
            {
                System.out.print(j);
            }
            sp--;
            System.out.println();
        }
    }
}