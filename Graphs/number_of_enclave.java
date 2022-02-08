class Solution {
    public void dfs(int[][] arr,int r,int c){
        int n = arr.length;
        int m = arr[0].length;
        arr[r][c] = 0;
     
        int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        
        for(int[] d : dir){
            int x = r + d[0];
            int y = c + d[1];
            
            if(x>=0 && x<n && y>0 && y<m && arr[x][y]==1 ){
              
                dfs(arr,x,y);
            }
        }
        
     
        
    }
    public int numEnclaves(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        int ans= 0;
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 ||j==0 || j==m-1){
                    if(arr[i][j]==1){
                        dfs(arr,i,j);
                    }
                }
                
            }
        }
      
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
        }
        
        return count;
        
       
    }
}
