class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int n = matrix.length;
        int m =matrix[0].length;
        
        int[][] indegree = new int[n][m];
        int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int[] d : dir){
                    int x = i + d[0];
                    int y = j + d[1];
                    
                    if(x>=0 && y>=0 && x<n && y<m && matrix[i][j] < matrix[x][y]){
                        indegree[x][y]++;
                    }
                }
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(indegree[i][j]);
            }
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(indegree[i][j] == 0){
                    q.add(i * m +j);
                }
            }
        }
        
        int level = 0;
        while(q.size()>0){
            int size = q.size();
            
            while(size-- > 0)
            {
                int rem = q.remove();
                
                int x = rem / m;
                int y = rem % m;
                
                for(int[] d: dir){
                    int r = x + d[0];
                    int c = y + d[1];
                    
                     if(r>=0 && r<n &&  c>=0 && c<m && matrix[x][y] < matrix[r][c]){
                        indegree[r][c]--;
                         if(indegree[r][c]==0){
                             q.add(r * m + c);
                         }
                    }
                }
            }
            
            level++;
        }
        
       
        return level;
        
        
        
    }
}
