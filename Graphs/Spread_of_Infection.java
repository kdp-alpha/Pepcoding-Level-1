import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
//   static class Pair {
//       int v;
//       int time;
//       Pair(int v,int time){
//           this.v = v;
//           this.time = time;
//       }
//   }

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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      // write your code here
      int ans = infect(graph,src,t,graph.length);
      System.out.println(ans);
      
   }
   
   public static int infect(ArrayList<Edge>[] graph,int src,int time,int n) {
      boolean[] vis = new boolean[n];
      ArrayDeque<Integer> q = new ArrayDeque<>();
      q.add(src);
      int count = 0;
      
      while(q.size()>0){
          int size = q.size();
          while(size-->0){
              int removed = q.remove();
              
              if(vis[removed]==true){
                  continue;
              }
              vis[removed] = true;
              if(time==1){
                  return count;
              }
              
              for(Edge e:graph[removed]){
                  if(vis[e.nbr] == false){
                      q.add(e.nbr);
                      count++;
                  }
              }
          }
          
          time--;
      }
      return count;
       
   }

}
