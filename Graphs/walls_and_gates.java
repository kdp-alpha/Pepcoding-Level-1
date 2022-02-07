public class Solution {
    /**
     * @param rooms: m x n 2D grid
     * @return: nothing
     */
    public void wallsAndGates(int[][] rooms) {
        int n = rooms.length;
        int m = rooms[0].length;
         int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] ans = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rooms[i][j]==0){
                    if(vis[i][j]==false){
                        q.add(i*m+j);
                        
                    }
                  
                }
            }

        }

        int level = 0;

        while(q.size()>0){
            int size = q.size();
            level++;
            while(size-->0){
                int rm = q.remove();
                int x = rm / m;
                int y = rm % m;

                for(int[] d:dir){
                    int r = x + d[0];
                    int c = y + d[1];
                    if(r>=0 && r<n && c>=0 && c<m && rooms[r][c] == 2147483647 && !vis[r][c]){
                        vis[r][c] = true;
                        rooms[r][c] = level;
                        q.add(r*m+c);
                    }
                }
            }
            
        }
      

    }
}
