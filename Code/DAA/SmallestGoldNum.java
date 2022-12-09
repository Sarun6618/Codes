import java.util.*;
class SmallestGoldNum
{
    static int count(int [][]a,int m,int n){
        int i;
        for(int j=0;j<n;j++){
            int x=a[0][j];
            for( i=0;i<m;i++){
                if(bsearch(a[i],m,x)){
                    continue;
                }
                else{
                    break;
                }
            }
            if(i==m){
                return x;
            }
        }
        return -1;
    }
    public static boolean bsearch(int []a,int u,int x){
        int l=0;
        while (l<=u){
            int mid=(l+u)/2;
            if (a[mid]==x){
                return true;
            }
            else if (x>a[mid]){
                l=mid+1;
            }
            else{
                u=mid-1;
            }
        }
        return false;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(),n=sc.nextInt();
        int [][]a=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println(count(a,m,n));
    }
}   
            

              