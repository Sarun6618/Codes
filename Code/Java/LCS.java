import java.util.*;
public class LCS {
    public static int LongestCommanSubsequence(String s1,String s2){
        int[][] arr=new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        return arr[s1.length()][s2.length()];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("longest common subsequence:"+ LongestCommanSubsequence(sc.next(),sc.next()));
    }
}
