class Solution {

    

    void bfs(int[][] grid, int sr, int sc, int[][] arr, boolean[][] vis, int[][] reach){
        int n = grid.length;
        int m = grid[0].length;
        int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        Queue<Integer> q = new ArrayDeque<>();
        q.add(sr * m + sc);

        int level = 0;
        while(q.size()>0){
            int size = q.size();
            level++;
            while(size-->0){
                int rem = q.remove();
            

                int i = rem / m;
                int j = rem % m;

                for(int[] d : dir){
                    int r = i + d[0];
                    int c = j + d[1];

                    if(r >= 0 && r < n && c >= 0 && c < m && grid[r][c] == 0 && !vis[r][c]){
                        vis[r][c] = true;
                        arr[r][c] += level;
                        reach[r][c]++;
                        q.add(r * m + c);
                    }
                }
            }
        }
    }


    int shortestDistance(int[][] grid) {
        // write your code here
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;
        int[][] arr = new int[n][m];
        int[][] reach = new int[n][m];
                           
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                   boolean[][] vis = new boolean[n][m];
                    bfs(grid, i, j, arr, vis, reach);
                    count++;
                }
            }
        }
        int mn = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(reach[i][j] == count){
                    mn = Math.min(mn, arr[i][j]);
                }
            }
        }
        return mn;
    }
};
