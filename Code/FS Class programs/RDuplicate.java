import java.util.*;
class  RDuplicate
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        //read the size and declare the array
        int size=s.nextInt();
        int a[]=new int[size];
        System.out.println("Enter array elements");
        //read the values
        for(int i=0;i<size;i++)
        a[i]=s.nextInt();
        int nsize=size;
        //logic
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<nsize;i++)
        {
            if(!l.contains(a[i]))
            l.add(a[i]);
        }
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
        s.close();
    }
}