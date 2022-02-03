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

      int src = Integer.parseInt(br.readLine());

      // write all your codes here
      HashSet<Integer> vis = new HashSet<>();
      hamiltonian(graph,src,vis,src+"",src);
   }
   
   
   public static void hamiltonian(ArrayList<Edge>[] graph,int src,HashSet<Integer> vis,String psf,int osrc){
       if(graph.length == psf.length()){
           System.out.print(psf);
           
           boolean flag = false;
           for(Edge e: graph[src]){
               if(e.nbr == osrc){
                   flag = true;
                   break;
               }
           }
           if(flag == true){
               System.out.println("*");
           }
           else
           {
               System.out.println(".");
           }
       }
       
       
       
       vis.add(src);
       
       for(Edge e: graph[src]){
           if(vis.contains(e.nbr) == false){
               hamiltonian(graph,e.nbr,vis,psf+e.nbr,osrc);
           }
       }
       
       vis.remove(src);
   }


}
