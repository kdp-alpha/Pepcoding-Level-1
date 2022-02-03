class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
           int n = graph.length;
            ArrayList<Integer> ans = new ArrayList<>();
           int[] vis = new int[n];
        Arrays.fill(vis,0);
        
        for(int i=0;i<n;i++){
            if(vis[i] == 0){
                boolean cycle = isCycle(graph,i,vis);
            }
            if(vis[i] == 2){
                ans.add(i);
            }
        }
        
        return ans;
    }
    
    
    public boolean isCycle(int[][] graph,int src,int[] vis){
        boolean cycle = false;
        
        vis[src] = 1;
        
        for(int i : graph[src]){
            if(vis[i]==0){
                cycle = cycle || isCycle(graph,i,vis);
            }
            else if(vis[i]==1){
                return true;
            }
        }
        
        if(cycle){
            return true;
        }
        
        vis[src] = 2;
        return cycle;
        
    }
}
