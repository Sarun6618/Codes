class Output3
{
    public static void main(String[] args)
    {
        //logic
        for(int i=1;i<=5;i++)
        {
            int c=i,m=4;
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c=c+m;
                m--;
            }
            System.out.println();
        }
    }
}