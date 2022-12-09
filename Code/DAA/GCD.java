import java.util.*;
class GCD{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String items[]=s.split(" ");
        int []arr=new int[items.length];
        sc.close();
        int min=Integer.parseInt(items[0]),max=Integer.parseInt(items[0]);
        for(int i=0;i<items.length;i++){
            int ele=Integer.parseInt(items[i]);
            if (ele<min){
                min=ele;
            }
            else if(ele>max){ 
                max=ele;
            }
            arr[i]=ele;
        }
        System.out.println(gcd(min,max));
        
        
    }
    static int gcd(int a,int b){
        if (a==0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }
}