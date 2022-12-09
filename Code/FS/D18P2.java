/*
Given a sorted list of integers, 

Your task is to find the continuous range of numbers, make them as groups
and print all the groups as show in the sample testcases.

For example:
Given list is [ 1, 2, 3 ]: 1, 2, 3 is continuous range, grouped as 1->3
Given list is [ 1, 2, 4, 5, 7 ]: 1, 2 is continuous range, grouped as 1->2, 
4,5 grouped as 4->5, 7 is left alone.

Note: List contain no duplicates.

Input Format:
-------------
Line-1 -> An integer N, number of elements.
Line-2 -> Space separated integers in sorted order

Output Format:
--------------
Print the list of continuous range groups.


Sample Input-1:
---------------
5
1 2 4 5 7

Sample Output-1:
----------------
[1->2, 4->5, 7]

Explanation: 
------------
1,2 form a continuous range; 4,5 form a continuous range.


Sample Input-2:
---------------
9
1 2 3 5 6 7 9 10 12

Sample Output-2:
----------------
[1->3, 5->7, 9->10, 12]

Explanation: 
------------
1,2,3 form a continuous range 
5,6,7 form a continuous range
9,10 form a continuous range

 */
import java.util.*;
class D18P2
{
    public static void main(String[] srgs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(Range(a));
    }
    static List<String>Range(int b[])
    {
        int length=1;
        List<String>l=new ArrayList<String>();
        if(b.length==0)
        return l;
        for(int i=1;i<=b.length;i++)
        {
            if(i==b.length||b[i]-b[i-1]!=1)
            {
                if(length==1)
                l.add(String.valueOf(b[i-length]));
                else
                l.add(b[i-length]+"->"+b[i-1]);
                length=1;
            }
            else
            length++;
        }
        return l;
    }
}