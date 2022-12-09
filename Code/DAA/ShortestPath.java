class ShortestPath 
{
    // A utility function to find the vertex with minimum distance value, 
    //from the set of vertices not yet included in shortest path tree
    static int x=Integer.MAX_VALUE;
    static final int V = 9;
    int minDistance(int dist[], Boolean s[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (s[v] == false && dist[v] <=min) 
            {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed distance array
    void printSolution(int dist[])
    {
        System.out.println("Vertex       Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + "         " + dist[i]);
    }

    // Function that implements Dijkstra's single source shortest path 
    // algorithm for a graph represented using adjacency matrix representation
    void dijkstra(int graph[][], int src)
    {
        //logic declare distance 
        int d[]=new int[V];
        // The output array. dist[i] will hold the shortest distance from src to i
        // s[i] will true if vertex i is included 
        //in shortest path tree or shortest distance from src to i is finalized
        
        //logic declare boolean array s[]
        Boolean []s=new Boolean[V];
        
        // Initialize all distances as INFINITE and s[] as false
        for(int i=0;i<V;i++){
            d[i]=Integer.MAX_VALUE;
            s[i]=false;
        }
        //logic
        
        // Distance of source vertex from itself is always 0
        d[src]=0;
        //logic
        
        // Find shortest path for all vertices
        for (int count = 1; count < V; count++) 
        {
            // Pick the minimum distance vertex from the set of vertices not yet processed. u is always equal to src 
            // in first iteration.
            //call minDistance
            int u=minDistance(d,s);
            s[u]=true;
            
            // Mark the picked vertex as processed
            // logic
            // Update dist value of the adjacent vertices of the picked vertex.
            for (int v = 0; v < V; v++)

                // Update dist[v] only if is not in s, there is an edge 
                //from u to v, and total weight of path from src to
                // v through u is smaller than current 
                //value of dist[v]
                //logic
                if(!s[v] && graph[u][v]!=0 && d[u]!=Integer.MAX_VALUE && d[v]>d[u]+graph[u][v] 
                 && d[u]!=Integer.MAX_VALUE){
                    d[v]=d[u]+graph[u][v];
                }
        }

        // print the constructed distance array
        printSolution(d);
    }

    // Driver method
    public static void main(String[] args)
    {
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0,0, 8, 0 },
                                    { 4, 0, 8, 0, 0,0, 0, 11, 0 },
                                    { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                                    { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                                    { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                                    { 0, 0, 4, 14, 10, 0, 2, 0, 0},
                                    { 0, 0,0, 0, 0, 2, 0, 1, 6 },
                                    { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                                    { 0, 0, 2, 0, 0, 0, 6, 7, 0} };
        ShortestPath t = new ShortestPath();
        t.dijkstra(graph, 0);
    }
}
            
