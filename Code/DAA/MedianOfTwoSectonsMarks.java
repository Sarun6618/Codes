import java.util.*;
class MedianOfTwoSectonsMarks
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            b[j]=sc.nextInt();
        }
        sc.close();
        System.out.println(findmedian(a,b,m,n));
    }
    static double findmedian(int []a,int []b,int m,int n){
        int s=0;
        int e=Math.min(m,n)-1;
        while(s<=e){
            int px=(s+e)/2;
            int py=(m+n+1)/2-px;
            int mxlx=px==0?Integer.MIN_VALUE:a[px-1];
            int mirx=px==m?Integer.MAX_VALUE:a[px];
            int mxly=py==0?Integer.MIN_VALUE:b[py-1];
            int miry=py==n?Integer.MAX_VALUE:b[py];
            if(mxlx<=miry && mxly<=mirx){
                if((m+n)%2==0){
                    return (Math.max(mxlx,mxly)+Math.min(mirx,miry))*1.0/2;
                }
                else{
                    return Math.max(mxlx,mxly);
                }
            }
            else if(mxlx>miry){
                e=px-1;
            }
            else{
                s=px+1;
            }
        }
        return 0;
    }
}
            

              