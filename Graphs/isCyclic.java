import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      // write your code here
      boolean[] visited = new boolean[vtces];
      boolean ans = false;
      for(int i=0;i<vtces;i++){
          if(visited[i] == false){
               ans = ans || isCycle(graph,visited,i);
      }
          }
         
      System.out.println(ans);
   }
   
   public static boolean isCycle(ArrayList<Edge>[] graph,boolean[] vis,int src){
       ArrayDeque<Integer> q = new ArrayDeque<>();
       q.add(src);
       
       while(q.size()>0){
           int remove = q.remove();
           
           if(vis[remove]==true){
               return true;
           }
           
           vis[remove] = true;
           
           for(Edge e : graph[src]){
               if(vis[e.nbr] == false){
                   q.add(e.nbr);
               }
           }
       }
       
       return false;
       
       
   }
}
