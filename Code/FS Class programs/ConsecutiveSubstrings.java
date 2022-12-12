/*Shyam is playing with group of characters, where the group of characters contain only A/B.
He has to return the count of non-empty substrings from this group which will have the same number of
A's and B's and all the A's and all the B's in these substrings are grouped consecutively
Substrings that occur multiple times are counted the number of times they occur.

case 1:
Input = AABBAABB
Output = 6
Explanation:
There are 6 substrings that have equal number of consecutive B's and A's:
"AABB", "AB", "BBAA", "BA", "AABB", and "AB".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "AABBAABB" is not a valid substring because all the A's (and B's) are not grouped together.
case 2:
Input = BABAB
Output = 4
Explanation:
There are 4 substrings: "BA", "AB", "BA", "AB" that have equal number of consecutive B's and A's.
test cases:
case=1
input=ABABABAB
output=7
case=2
input=AAAABBBB
output=4
case=3
input=ABA
output=2
case=4
input=BABABABAAABBB
output=10
case=5
input=AB
output=1
*/
import java.util.*;
class ConsecutiveSubstrings
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String st=s.next();
        int n=st.length();
        int a=0,i=0;
        while(i<n)
        {
            int ct1=0,ct2=0;
            if(st.charAt(i)=='A')
            {
                while(i<n && st.charAt(i)=='A')
                {
                    ct1++;i++;
                }
                int j=i;
                while(j<n&&st.charAt(j)=='B')
                {
                    ct2++;j++;
                }
            }
            else
            {
                while(i<n &&st.charAt(i)=='B')
                {
                    ct2++;i++;
                }
                int j=i;
                while(j<n && st.charAt(j)=='A')
                {
                    ct1++;j++;
                }
            }
            a+=Math.min(ct1,ct2);
        }
        s.close();
        System.out.println(a);
    }
}
