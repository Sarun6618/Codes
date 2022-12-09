import java.util.*;
class Item 
{
  int value, weight;
  //logic
  Item(int a,int b){
      this.value=a;
      this.weight=b;
  }
}

class itemComparator implements Comparator<Item>
{
    @Override
    public int compare(Item a, Item b) 
    {
        double r1 = (double)(a.value) / (double)(a.weight); 
        double r2 = (double)(b.value) / (double)(b.weight); 
        if(r1 < r2) return 1; 
        else if(r1 > r2) return -1; 
        else return 0; 
    }
}
public class GreedyKnapsack
{
    static double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr, new itemComparator()); 
        double[] x=new double[n];
        for(int i=0;i<n;i++){
            x[i]=0.0;
        }
        //logic
        int i;
        for( i=0;i<n;i++){
            if(arr[i].weight>W)
                break;
            x[i]=1.0;
            W=W-arr[i].weight;
        }
        if(i<=n){
            x[i]=W*1.0/arr[i].weight;
        }
        double ans=0.0;
        for( i=0;i<n;i++){
            ans+=x[i]*arr[i].value;
        }
        return ans;
    }
    public static void main(String args[])
    {
        int n = 3, weight = 20;
        Item arr[] = {new Item (25,18),new Item(24,15),new Item(15,10)};
        double ans = fractionalKnapsack(weight, arr, n);
        System.out.println("The maximum value is "+ans);
    }
}
            

              