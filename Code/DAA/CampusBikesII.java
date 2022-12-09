import java.util.*;

class CampusBikesII 
{
    // Maximum number of bikes is 10
    boolean visited [] = new boolean[10];
    int smallestDistanceSum = Integer.MAX_VALUE;
    
    // Manhattan distance
    private int findDistance(int[] worker, int[] bike) 
	{
        //logic
        return (Math.abs(worker[0]-bike[0])+Math.abs(worker[1]-bike[1]));
    }
    
    private void minimumDistanceSum(int[][] workers, int workerIndex, int[][] bikes, int currDistanceSum)
	{
        if (workerIndex >= workers.length) 
		{
            //logic
            smallestDistanceSum=Math.min(smallestDistanceSum,currDistanceSum);
            return;
        }
        // If the current distance sum is greater than the smallest result 
        // found then stop exploring this combination of workers and bikes
        if (currDistanceSum >= smallestDistanceSum)
		{
		    //logic
		    return;
        }
        for (int bikeIndex = 0; bikeIndex < bikes.length; bikeIndex++)
		{
            // If bike is available
            if (!visited[bikeIndex]) 
			{
                //logic
                visited[bikeIndex]=true;
                minimumDistanceSum(workers,(workerIndex+1),bikes,(currDistanceSum+findDistance(workers[workerIndex], bikes[bikeIndex])));
                visited[bikeIndex]=false;
            }
        }
    }
    
    public int assignBikes(int[][] workers, int[][] bikes)
	{
        minimumDistanceSum(workers, 0, bikes, 0);
        return smallestDistanceSum;
    } 

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m,n, m<=n");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int bikes[][]=new int[n][2];
		int men[][]=new int[m][2];
		for(int i=0;i<m;i++){
			men[i][0]=sc.nextInt();
			men[i][1]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			bikes[i][0]=sc.nextInt();
			bikes[i][1]=sc.nextInt();
		}
        sc.close();
		System.out.println(new CampusBikesII().assignBikes(men,bikes)); 
	}
}