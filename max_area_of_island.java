class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
    
        int current = 0;
        int maxsize = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && visited[i][j] ==false ){
                    
                    current = drawtree(grid,i,j,visited);
                    maxsize = Math.max(maxsize,current);
                    
                }
                current = 0;
            }
        }
        return maxsize;
        
    }
    
    public int drawtree(int[][] arr,int i,int j,boolean[][] visited){
        if(i<0 || j<0 ||i>=arr.length || j>= arr[0].length || arr[i][j]==0 ||
          visited[i][j]==true){
            return 0;
        }
        
        visited[i][j] = true;
        int sum = 1;
        
        sum += drawtree(arr,i-1,j,visited);
        sum += drawtree(arr,i,j+1,visited);
        sum += drawtree(arr,i+1,j,visited);
         sum += drawtree(arr,i,j-1,visited);
        return sum;
    }
}
