class Output2
{
    public static void main(String[] args)
    {
        //logic
        int ct=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ct++%2+" ");
            }
            System.out.println();
        }
    }
}