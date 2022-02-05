class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        ArrayList<Integer>[] graph = new ArrayList[n];
        int[] indegree = new int[n];
       int[] ans = new int[n];
        
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int[] e:prerequisites){
            int u = e[0];
            int v = e[1];
            indegree[v]++;
            graph[u].add(v);
        }
        
        Queue<Integer> q = new ArrayDeque<>();
      
        
        
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        
        int idx = 0;
        while(q.size()>0){
            int rm = q.remove();
          
            ans[idx] = rm;
            idx++;
            
            for(int e:graph[rm]){
                indegree[e]--;
                if(indegree[e]==0){
                    q.add(e);
                }
            }
        }
        
        if(ans.length != 0){
            int s = 0;
        int e = ans.length -1;
        while(s<e){
            int temp = ans[s];
            ans[s] = ans[e];
            ans[e] = temp;
            s++;
            e--;
        }
            
        }
       
        
        if(idx!=numCourses){
           int[] arr = new int[0];
            return arr;
            
        }
       
        
            return ans;
        
    }
}
