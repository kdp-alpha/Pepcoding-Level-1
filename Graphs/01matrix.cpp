class Solution {
    public int[][] updateMatrix(int[][] arr) {
        int n = arr.length;
        int m =arr[0].length;
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        boolean[][] vis = new boolean[n][m];
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    
                        q.add(i*m+j);
                  
                    
                }
                else
                {
                    arr[i][j]=-1;
                }
            }
        }
        
       int level=0;
        
        while(q.size()>0){
           
            int size = q.size();
            level++;
            while(size-->0){
                int rm = q.remove();
                int x = rm / m;
                int y = rm % m;
                for(int[] d: dir){
                    int r = x + d[0];
                    int c = y + d[1];
                    
                    if(r<0 || r>=n || c<0 || c>=m || arr[r][c]!=-1 ){
                        continue;
                    }
                    arr[r][c] = level;
                    q.add(r*m+c);
                    
                }
                
            
            }
            
            
        }
        
      
        
        return arr;
        
        
    }
}
