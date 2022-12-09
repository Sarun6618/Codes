/*
Krish a Javelin throw player. He practices every day throwing n number of times. His coach wanted to count the number of times he has thrown the maximum distance. Write a java program to help his coach to find the number of times he has thrown the maximum distance on a particular day.
*/
import java.util.*;
class CountMax
{
    //logic
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),max=Integer.MIN_VALUE,ct=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int c:a)
        {
            if(c>max)
            {
                max=c;
                ct=1;
            }
            else if(c==max)
            ++ct;
        }
        s.close();
        System.out.println(ct);
    }
}
/*
input =30
22 24 21 24 24 22 21 21 22 24 24 24 23 24 21 21 23 24 23 24 24 21 21 23 22 24 21 23 22 22
output =11
input =50
25 20 20 20 20 23 21 23 25 24 20 22 25 22 20 24 22 23 24 24 25 21 22 24 23 24 25 21 25 20 21 21 22 24 25 20 20 21 22 25 23 20 23 22 21 22 23 23 25 25
output =10
*/