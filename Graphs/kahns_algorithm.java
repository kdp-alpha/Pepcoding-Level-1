class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        int[] toposort = new int[V];
        int[] indegree = new int[V];
        
        for(int i=0;i<V;i++)
        {
            for(Integer it:adj.get(i)){
                indegree[it]++;
            }
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0;i<V;i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        
        int idx = 0;
        while(q.size()>0){
            int node = q.remove();
            toposort[idx++] = node;
            
            for(Integer it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        
        if(toposort.length == V){
            return toposort;
        }else {
            int[] a = new int[1];
            a[0] = -1;
            return a;
        }
    }
}
