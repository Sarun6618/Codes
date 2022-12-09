import java.util.*;
class SpecialNumber{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        while(n>=10){
            int s=0;
            while(n>0){
                int rem=n%10;
                s+=rem*rem; 
                n=n/10;
            }
            n=s;
        }
        if (n==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}