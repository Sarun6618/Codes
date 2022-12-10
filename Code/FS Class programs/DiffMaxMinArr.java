/*
     You hired three programmers and you (hopefully) pay them.
     Write a java programe that takes three numbers (the hourly wages of each programmer) and
     returns the difference between the highest-paid programmer and the lowest-paid.

     Examples
     input                    output
     147, 33, 526 ------------> 493

    33, 72, 74 ------------> 41

    1, 5, 9 ------------> 8

    sample:
    input=72
    75
    33
    output=42

    */
import java.util.*;
class DiffMaxMinArr
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int arr[]=new int[3];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<3;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println(max-min);
        s.close();
    }
}