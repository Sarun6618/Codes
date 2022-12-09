//Unique Number of Occurrences
import java.util.*;
class UniqueNoOfOccurrences
{
    public static boolean uniqueOccurrences(int[] arr) {
        final int k=1000;
        int freq[]=new int[2*k+1];
        for(int num:arr)
        {
            freq[num+k]++;
        }
        Arrays.sort(freq);
        for(int i=0;i<2*k;i++)
        {
            if(freq[i]!=0 && freq[i]==freq[i+1])
                return false;
        }
        return true;
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
        s.close();
        System.out.println(uniqueOccurrences(arr));
    }
}