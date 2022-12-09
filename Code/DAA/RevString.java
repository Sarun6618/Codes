import java.util.*;
class RevString
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char []ch=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            char t=ch[i];
            ch[i++]=ch[j];
            ch[j--]=t;
        }
       String sa=new String(ch);
       sc.close();
       System.out.println(sa);
    }
}