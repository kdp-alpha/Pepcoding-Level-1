class Solution {
    public int maxDistance(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        boolean[][] vis = new boolean[n][m];
       
        Queue<Integer> q = new ArrayDeque<>();
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    if(vis[i][j] == false){
                        q.add(i*m+j);
                    }
                }
            }
        }
        if(q.size() == n*m){
            return -1;
        }
        
        int level = 0;
        while(q.size()>0){
            int size = q.size();
            while(size-->0){
                int rm = q.remove();
                int r = rm / m;
                int c = rm % m;
                
                for(int[] d:dir){
                    int x = r + d[0];
                    int y = c + d[1];
                    
                    if(x>=0 && x<n && y>=0 && y<m && arr[x][y]==0 && !vis[x][y]){
                        vis[x][y] = true;
                        q.add(x*m+y);
                    }
                }
            }
            level++;
        }
        return level -1;
    }
}
