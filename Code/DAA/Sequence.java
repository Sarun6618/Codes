import java.util.*;
class Sequence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(),n2=sc.nextInt(),k=sc.nextInt(),count=0;
        for(int i=0;i<k-2;i++){
            count=n1+n2;
            n1=n2; 
            n2=count;
        }
        System.out.println(count);
        sc.close();
    }
}