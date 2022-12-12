/*Write a Java program to perform Decimal to any base Conversion.

Read two integers, First integer indicates decimal value and
second integer indicates base. After conversion print the output.

Note: If base<=0 or base>=9 print -1.

Sample 1:
input=10
2
output=1010

Sample 2:
input=100
5
output=400
*/
import java.util.*;
class Decimal_AnyBase{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();
        if(b<=0 ||b>=9){
            System.out.println(-1);
            System.exit(0);
        }
        long bin=0;
        int r,i=1;
        while(n!=0){
            r = n%b;
            n = n/b;
            bin = bin+r*i;
            i = i*10;
        }
        System.out.println(bin);
        s.close();
    }
}