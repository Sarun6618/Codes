/*
Given an integer array nums , move all 0 's to the end of it while maintaining the relative order of the non-zero
elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]
Test case=
case=1
input=
5
0 1 0 3 12
output=
1 3 12 0 0
case=2
input=
1
0
output=
0
*/
import java.util.*;
class MoveZero
{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int ct=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            arr[ct++]=arr[i];
        }
        while(ct<n)
        arr[ct++]=0;
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        s.close();
    }
}