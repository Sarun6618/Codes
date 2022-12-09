/*
KCR Chief Minister of Telangana Government has passed a new G.O to 
Telangana police for safety of Telangana people. In this regard, the CM announced 
new Vehicles to be released for all the stations working for this mission especially.

Here we have a 2D mesh, there are P police officers and V vehicles, with P<=V.
Each police officer and vehicle is a 2D coordinate on this mesh.
Here the government has assigned a unique vehicle to each police officer.

Now create a method which prints the minimum possible sum of distances between 
each police officer and their assigned vehicle.

Here the distance is between police officer Pi and vehicle Vi assigned to him.
And distance between Pi, Vi is calculated as follows: |Pi.x - Vi.x| + |Pi.y - Vi.y|


Input Format:
-------------
Line-1: Two integers P and V, number of police officers and vehicles.
Next P lines: Two space separated integers co-ordinates of Police officers.
Next V lines: Two space separated integers co-ordinates of Vehicles.

Output Format:
--------------
Print an integer, the minimum possible sum of distances.


Sample Input-1:
---------------
3 3
0 1		// co-ordinates of police
1 2
1 3
4 5		// co-ordinates of vehicles
2 5
3 6

Sample Output-1:
----------------
17


Sample Input-2:
---------------
2 2
0 0		// co-ordinates of police
2 1
1 2		// co-ordinates of vehicles
3 3

Sample Output-2:
----------------
6


*/
class Vehicles{
    int sum=Integer.MAX_VALUE;
    boolean visited[]=new boolean[20];
    public static int finddist(int[] police,int[] vehicle){
        return (Math.abs(police[0]-vehicle[0])+Math.abs(police[1]-vehicle[1]));
    }
    public void minsum(int[][] police,int policeindex,int[][] vehicles,int cursum){
        if(policeindex>=police.length){
            sum=Math.min(sum,cursum);
        }
        if(cursum>=sum){
            return ;
        }
        for(int i=0;i<vehicles.length;i++){
            if(!visited[i]){
                visited[i]=true;
                minsum(police,policeindex+1,vehicles,(cursum+finddist(police[policeindex],vehicles[i])));
                visited[i]=false;
            }
        }
    }
    public int assignVehicles(int[][] police, int[][] vehicles) {
        //Implement your logic here.
        minsum(police,0,vehicles,0);
        return sum;
    }
    public static void main(String args[])
    {
        
    }
}
