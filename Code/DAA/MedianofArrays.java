import java.util.*;
class MedianofArrays 
{
    static int median(int a[],int b[])
    {
        int i=0,j=0,k=0;
        int c[]=new int[a.length+b.length];
        //logic
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        if(k%2==0){
            return (c[k/2]+c[(k/2)+1])/2;
        }
        else
        {
            return c[k/2];
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the I array");
        int n1=s.nextInt();
        System.out.println("Enter the size of the II array");
        int n2=s.nextInt();
        int a[]=new int[n1];
        int b[]=new int[n2];
        System.out.println("Enter the values of I array");
        for(int i=0;i<n1;i++)
            a[i]=s.nextInt();
        System.out.println("Enter the values of II array");
        for(int i=0;i<n2;i++)
            b[i]=s.nextInt();
        s.close();
        System.out.print("Median is "+median(a,b));
    }
}

            

              