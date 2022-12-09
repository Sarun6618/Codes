/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/
import java.util.*;
class TwoSum
{
    public static void main(String args[])
    {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=r.nextInt();
        }
        int target=r.nextInt();
        System.out.println(twosum(nums,target));
        r.close();
    }
    public static int[] twosum(int[] nums,int t)
    {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Integer d=(Integer)(t-nums[i]);
            if(h.containsKey(d))
            {
                int res[]={h.get(d),i};
                return res;
            }
            h.put(nums[i],i);
        }
        return null;
    }
}