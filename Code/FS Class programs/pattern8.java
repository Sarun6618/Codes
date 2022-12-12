/*Write a java Program for Below Pattern
input:
How Many Rows You Want In Your Pyramid
9
output:
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 6 5 4 3 2 1
      1 2 3 4 5 6 5 4 3 2 1
        1 2 3 4 5 4 3 2 1
          1 2 3 4 3 2 1
            1 2 3 2 1
              1 2 1
                1
*/
import java.util.*;
class pattern8
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sp=n;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i*2;j++)
            System.out.print(" ");
            for(int j=1;j<=sp;j++)
            System.out.print(j+" ");
            for(int j=sp-1;j>=1;j--)
            System.out.print(j+" ");
            System.out.println();
            sp--;
        }
        s.close();
    }
}