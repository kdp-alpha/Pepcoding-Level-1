import java.lang.reflect.Array;
import java.util.*;

public class oops1{

    public static class Edge{
        int v;
        Edge(int v){
            this.v = v;
        }
    }

    public static void addedge(ArrayList<Edge>[] graph,int u,int v){
        graph[u].add(new Edge(v));
    }
    public static void dfs(ArrayList<Edge>[] graph,int src,Stack<Integer> st,boolean[] vis){
        vis[src]= true;
        for(Edge e:graph[src]){
            if(!vis[e.v]){
                dfs(graph,e.v,st,vis);
            }
        }
        st.push(src);

    }

    public static void revDfs(int node,ArrayList<Edge>[] graph,boolean[] vis){
        vis[node] = true;
        System.out.println(node + " ");
        for(Edge it:graph[node]){
            if(vis[it.v]==false){
                revDfs(it.v, graph, vis);
            }
        }
    }

    public static void kosaraju(ArrayList<Edge>[] graph,int n){
        boolean[] vis = new boolean[n+1];
        Stack<Integer> st = new Stack<>();
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                dfs(graph,i,st,vis);
            }
        }

        ArrayList<Edge>[] transpose =new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            transpose[i] = new ArrayList<>();
        }

        for(int i=1;i<=n;i++){
            vis[i] = false;
            for(Edge it:graph[i]){
                int u = it.v;
                
                transpose[u].add(new Edge(i));
            }
        }

        while(st.size()>0){
            int node = st.pop();
            if(vis[node] ==false){
                System.out.print("SCC: ");
                revDfs(node,transpose,vis);
                System.out.println();
            }
        }


    }

 
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Edge>[] graph = new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            graph[i] = new ArrayList<>();
        }

        addedge(graph,1,2);
        addedge(graph, 2, 3);
        addedge(graph, 3, 1);
        addedge(graph, 2, 4);
        addedge(graph, 4, 5);

        
        kosaraju(graph, n);
    }
    
}
