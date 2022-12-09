import java.util.*; 
class MaxSubArray 
{
    static int large(int a[], int size)
    {
        //logic
        int n=a.length;
        int max_so_far=0,max_ending_here=0;
        for(int i=0;i<n;i++)
        {
            max_ending_here+=a[i];
            if(max_ending_here<0)
            {
                max_ending_here=0;
            }
            else if(max_so_far<max_ending_here)
            {
                max_so_far=max_ending_here;
            }
        }
        return max_so_far;
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=s.nextInt();
        s.close();
        int a[]=new int[n];
        int i;
        System.out.println("Enter the array values");
        for(i=0;i<n;i++)
            a[i]=s.nextInt();
        int m=large(a,n);
        System.out.println("Sum is "+m);
    }
}
/*
 * import java.util.*;
class MaxSubArray 
{
	static int large(int a[], int size)
	{
		//logic
		int mr=0;
		int ms=0;
		for(int i=0;i<a.length;i++){
		    mr+=a[i];
		    if (mr<0){
		        mr=0;
		    }
		    else{
		        if(ms<mr){
		            ms=mr;
		        }
		    }
		}
		return ms;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		System.out.println("Enter the array values");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		int m=large(a,n);
		System.out.println("Sum is "+m);
	}
}

 */