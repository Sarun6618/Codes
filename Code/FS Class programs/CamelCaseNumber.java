/*Write a java program to find if a given positive number is a Camel Case Number or Not
A number is said to be Camel Case Number if the First digit of the number is always greater than
or equal to the digits which are right side to it and if a number contains a single digit it is
always assumed it as a Camel Case.
If the given Number is Camel Case Print "Camel Case" else print "Not Camel Case"
If any negative number is given print "Not Camel Case"
sample 1:
input=543
output=Camel Case
sample 2:
input=582
output=Not Camel Case
*/
import java.util.*;
class CamelCaseNumber
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int max=Integer.MIN_VALUE;
        if(n<0)
        {
            System.out.println("Not Camel Case");
            System.exit(0);
        }
        while(n>0)
        {
            int r=n%10;
            if(r>=max)
            {
                max=r;
            }
            else
            {
                System.out.println("Not Camel Case");
                System.exit(0);
            }
            n/=10;
        }
        System.out.println("Camel Case");
        s.close();
    }
}
