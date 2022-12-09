class MaxGold
{
    int dfs(int[][] grid,int i,int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0){
            return 0;
        }
        int res=0,temp=grid[i][j];
        grid[i][j]=0;
        res=Math.max(res,dfs(grid,i-1,j,m,n));
        res=Math.max(res,dfs(grid,i,j+1,m,n));
        res=Math.max(res,dfs(grid,i,j-1,m,n));
        res=Math.max(res,dfs(grid,i+1,j,m,n));
        grid[i][j]=temp;
        return temp+res;
    }
    public int getMaximumGold(int[][] grid) {
        //Implement your logic here.
        int ans=0,m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    ans=Math.max(ans,dfs(grid,i,j,m,n));
                }
            }
        }
        return ans;
    }
}