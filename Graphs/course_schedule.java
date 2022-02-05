class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         int n = numCourses; 
        ArrayList<Integer>[] graph = new ArrayList[n];
       
        int[] indegree = new int[n];
        Arrays.fill(indegree,0);
        
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        
       
        
        for(int[] e: prerequisites){
            int u = e[0];
            int v = e[1];
            indegree[v]++;
           graph[u].add(v);
        }
        
        int c = 0;
        
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        while(q.size()>0){
            int rm = q.remove();
            c++;
            
            for(int e:graph[rm]){
                indegree[e]--;
                if(indegree[e]==0){
                    q.add(e);
                }
            }
        }
        
        return n == c;
    }
}
