class Solution {
    int level = 0;
    public boolean dfs(int src,List<List<Integer>> arr,boolean[] vis){
        vis[src] = true;
        level++;
        boolean ans = false;
        for(int e:arr.get(src)){
            if(!vis[e]){
                ans = ans || dfs(e,arr,vis);
            }
        }
        
        if(level == arr.size()){
            return true;
        }
        return false;
    }
    
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        
       boolean ans = dfs(0,rooms,vis);
        return ans;
        
    }
}
