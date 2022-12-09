/*
This Triangular Number Sequence is generated from a pattern of dots that form a triangle.
The first 5 numbers of the sequence, or dots, are:
1, 3, 6, 10, 15
This means that the first triangle has just one dot, the second one has three dots,
the third one has 6 dots and so on.
Write a function that gives the number of dots with its corresponding triangle number of the sequence.
Example sample
input  output
1 ----> 1
6 ----> 21
215 ----> 23220
Notes
Check the Resources for info on triangular number sequence.
*/
import java.util.*;
class Triangular_No
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ct=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            ct++;
        }
        System.out.println(ct);
        s.close();
    }
}