class Output1
{
    public static void main(String[] args)
    {
        //logic
        int ct=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                ct++;
                System.out.print(ct+" ");
            }
            System.out.println();
        }
    }
}
