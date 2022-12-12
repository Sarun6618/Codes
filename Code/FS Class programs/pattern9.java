/*
Write a Java program to print following pattern

    input=5
     output=
     ABCDEDCBA
     ABCD DCBA
     ABC   CBA
     AB     BA
     A       A

    */

import java.util.*;
class Test
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=65;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print((char)(a+j));
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print(" ");
            }
            for(int l=n-i;l>0;l--)
            {
                if(l!=n)
                System.out.print((char)(a+l-1));
            }
            System.out.println();
        }
        s.close();
    }
}