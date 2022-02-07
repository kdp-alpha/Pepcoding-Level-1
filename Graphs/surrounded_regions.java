class Solution {
    public void dfs(char[][] arr,int r,int c){
        int n = arr.length;
        int m = arr[0].length;
        int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        arr[r][c] = '*';
        
        for(int[] d:dir){
            int x = r + d[0];
            int y = c + d[1];
            
            if(x >=0 && x<n && y>=0 && y<m && arr[x][y] == 'O'){
                dfs(arr,x,y);
            }
        }
    }
    public void solve(char[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0|| i == n-1 || j==0|| j==m-1){
                    if(arr[i][j]=='O'){
                        dfs(arr,i,j);
                    }
                    
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(arr[i][j]=='*'){
                    arr[i][j]='O';
                }
                else if(arr[i][j]=='O'){
                    arr[i][j]='X';
                }
            }
        }
        
    }
}
