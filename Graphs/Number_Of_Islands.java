import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      // write your code here
      boolean[][] visited = new boolean[arr.length][arr[0].length];
      int count = 0;
      
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr[0].length;j++)
          {
              if(arr[i][j]==0 && visited[i][j]==false)
              {
                  count++;
                  drawTree(arr,i,j,visited);
              }
          }
      }
      System.out.println(count);
   }
   
   public static void drawTree(int[][] arr,int i,int j,boolean[][] vis)
   {
       if(i<0 || j<0 || i>= arr.length || j>=arr[0].length || arr[i][j]==1 ||
       vis[i][j]==true)
       {
           return;
       }
       vis[i][j] = true;
       
       drawTree(arr,i-1,j,vis);
       drawTree(arr,i,j+1,vis);
       drawTree(arr,i,j-1,vis);
       drawTree(arr,i+1,j,vis);
   }

}
