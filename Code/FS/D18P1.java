/*
Salman is given two binary numbers as strings B1 and B2 respectively.
He is new to binary number system. Now, you need to help Salman,
to add these binary numbers and print the resultant binary number as string.

Input Format:
-------------
Two space seprataed string, binary strings B1 and B2.

Output Format:
--------------
Print the String, resultant binary string


Sample Input-1:
---------------
1010110
11101011

Sample Output-1:
----------------
101000001


Sample Input-2:
---------------
101010
10101

Sample Output-2:
----------------
111111

 */
import java.util.*;
public class D18P1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(SumOfBin(sc.next(),sc.next()));
        sc.close();
    }
    static String SumOfBin(String s1,String s2)
    {
        int i=s1.length()-1,j=s2.length()-1,carry=0;
        StringBuilder a=new StringBuilder();
        while(i>=0 || j>=0)
        {
            int sum=carry;
            if(i>=0)
            sum+=Integer.parseInt(s1.charAt(i--)+"");
            if(j>=0)
            sum+=Integer.parseInt(s2.charAt(j--)+"");
            a.append(sum%2);
            carry=sum/2;
        }
        if(carry!=0)
        a.append(carry);
        return a.reverse().toString();
    }
}