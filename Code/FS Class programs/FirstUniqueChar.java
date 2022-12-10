/*
Given a string s , find the first non-repeating character in it and return its index.
If it does not exist, return -1 .
Example 1:
Input: s = "techtricks"
Output: 1
Example 2:
Input: s = "leetcode"
Output: 0
Example 3:
Input: s = "aabb"
Output: -1
Example 4
Input: S = "mindorks"
Output: 0
Testcases:
case=1
input=
leetcode
output=
0
case=2
input=
mymy
output=
-1
case=3
input=
techtricks
output=
1
case=4
input=
mindorks
output=
0
*/
import java.util.*;
class FirstUniqueChar
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        for(int i=0;i<st.length();i++)
        {
            if(st.indexOf(st.charAt(i),st.indexOf(st.charAt(i))+1)==-1)
            {
                System.out.println(st.indexOf(st.charAt(i)));
                break;
            }
        }
        s.close();
    }
}
