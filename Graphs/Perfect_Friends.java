import java.io.*;
import java.util.*;

public class Main {
    
    public static class Edge {
        int v;
        int edge;
        
        Edge(int v,int edge)
        {
            this.v = v;
            this.edge = edge;
        }
    }
   

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine()); // no of vertices
      int k = Integer.parseInt(br.readLine()); // 
      
      // write your code here
      ArrayList<Edge>[] graph = new ArrayList[n];
      
      for(int v=0;v < n;v++)
      {
          graph[v] = new ArrayList<>();
      }
      
      for(int e=0; e < k; e++){
          String line = br.readLine();
          String[] parts = line.split(" ");
          int v1 = Integer.parseInt(parts[0]);
          int v2 = Integer.parseInt(parts[1]);
          graph[v1].add(new Edge(v1,v2));
          graph[v2].add(new Edge(v2,v1));
          
      }
      
      boolean[] vis = new boolean[n];
      ArrayList<ArrayList<Integer>> cops = new ArrayList<>();
      for(int v=0; v<n;v++)
      {
          if(vis[v]==false)
          {
              ArrayList<Integer> ans = new ArrayList<>();
              drawTree(graph,v,ans,vis);
              cops.add(ans);
          }
      }
      int pair = 0;
      
      for(int i=0;i<cops.size();i++){
          for(int j=i+1;j<cops.size();j++){
              int count = cops.get(i).size() * cops.get(j).size();
              pair += count;
          }
      }
      
      System.out.println(pair);
      
   }
   
   public static void drawTree(ArrayList<Edge>[] graph,int src,ArrayList<Integer> comp,boolean[] vis)
   {
       vis[src] = true;
       comp.add(src);
       
       for(Edge e: graph[src]){
           if(vis[e.edge] == false)
           {
               drawTree(graph,e.edge,comp,vis);
           }
       }
   }
   
   
   
   

}
