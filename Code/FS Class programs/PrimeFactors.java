//Given a number print all the factors of a given number which are also prime numbers.
import java.util.*;
class PrimeFactors
{
    public static void main(String[] args)
    {
        //logic
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        Set<Integer>st=new HashSet<>();
        {
            for(int i=2;i<=n;i++)
            {
                while(n%i==0)
                {
                    st.add(i);
                    n/=i;
                }
            }
            List<Integer>l=new ArrayList<>(st);
            Collections.sort(l);
            for(int i:l)
            {
                System.out.println(i);
            }
        }
        r.close();
    }
}
/*
    input=133
    output=7
    19
    input=36
    output=2
    3
*/
