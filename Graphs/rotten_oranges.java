class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length == 0){
            return 0;
        }
        int rows = grid.length;
        int column = grid[0].length;
        int total_count = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++)
            {
                if(grid[i][j] == 2){
                    queue.add(new int[]{i,j});
            }
                if(grid[i][j]!=0)
                {
                    
                    total_count++;
                }
            }
        }
        
        if(total_count==0){
            return 0;
        }
        
        int countmin = 0;
        int cnt = 0;
        int[] dx = {0,0,1,-1};
        int[] dy = {1,-1,0,0};
        
        while(queue.size()>0){
            int size = queue.size();
            cnt += size;
            for(int i=0;i<size;i++){
                int[] point = queue.remove();
                for(int j=0;j<4;j++){
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];
                    
                    if(x<0 || y<0 || x>=rows || y>=column || grid[x][y]==0 || grid[x][y]==2) continue;
                    grid[x][y] =2;
                    
                    queue.add(new int[]{x,y});
                }
            }
            if(queue.size()!=0)
                {
                    countmin++;
               
                 }
        
        }
        
        
        return total_count == cnt ? countmin : -1;
        
        
        
        
    }
}
