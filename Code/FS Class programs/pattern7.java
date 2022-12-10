/* Write a Java program with the following Scenario
given some integers calcuate the average and check whether the average is whole
number or not
if it is whole number print --> true
esle print  --> false
Create a function that takes an array as an argument and returns true or false depending on
whether the average of all elements in the array is a whole number or not.
Examples
2    //number of integers to be passed
1, 3-------->true
explanation: avg of 1,3 is 4/2 --> 2 so true
4
1, 2, 3, 4-------->false
explanation: avg of 1,2,3,4 is 10/4 --> 2.5 so false
3
1, 5, 6-------->true
3
1, 1, 1-------->true
4
9, 2, 2, 5-------->false
*/
import java.util.*;
class pattern7
{
    public static boolean wn(int arr[])
    {
        int n=arr.length;
        double t=0;
        for(int i=0;i<n;i++)
        {
            t=t+arr[i];
        }
        double a=(t/n);
        if(Math.floor(a)==a)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(wn(arr));
        s.close();
    }
}
