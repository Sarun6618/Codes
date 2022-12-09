import java.util.*;
class LCP
{
    static String LCP1(String []s){
        Arrays.sort(s);
        String s1=s[0],s2=s[s.length -1];
        int m=Math.min(s1.length(),s2.length());
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<m;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                break;
            }
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String arr[]=s.split(" ");
        in.close();
        System.out.print(LCP1(arr));
    }
}
            

              