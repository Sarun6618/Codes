import java.util.*;

public class Maze 
{
    public boolean hasPath(int[][] maze, int[] start, int[] destination) 
	{
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        return dfs(maze, start, destination, visited);
    }
    public boolean dfs(int[][] maze, int[] start, int[] destination, boolean[][] visited) 
	{
        //logic
        if(visited[start[0]][start[1]])
        return false;
        if(start[0]==destination[0] && start[1]==destination[1])
        return true;
        visited[start[0]][start[1]]=true;
        int dirs[][]={{-1,0},{0,1},{0,-1},{1,0}};
        for(int dir[]:dirs)
        {
            int x=start[0];
            int y=start[1];
            while(x>=0 && y>=0 && x<maze.length && y<maze[0].length && maze[x][y]==0)
            {
                x+=dir[0];
                y+=dir[1];
            }
            if(dfs(maze,new int[]{x-dir[0],y-dir[1]},destination,visited))
            return true;
        }
        return false;
    }
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of the maze");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int maze[][]=new int[m][n];
		int start[]=new int[2];
		int destination[]=new int[2];
		System.out.println("Enter maze");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				maze[i][j]=sc.nextInt();
		System.out.println("Enter start position coordinates");
		for(int i=0;i<2;i++)
			start[i]=sc.nextInt();
		System.out.println("Enter destination position coordinates");
		for(int i=0;i<2;i++)
			destination[i]=sc.nextInt();
        sc.close();
		System.out.println(new Maze().hasPath(maze,start,destination));
	}
}