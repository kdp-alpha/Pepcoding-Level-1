import java.util.*;

public class Main{

public static void main(String[] args) {
    int n = 3;
    int m = 3;
    
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
    
    for(int i=0;i<=n;i++)
    {
        adj.add(new ArrayList<Integer>());
    }
    
    adj.get(1).add(2);
    adj.get(2).add(1);
    
    adj.get(2).add(3);
    adj.get(3).add(2);
    
    adj.get(1).add(3);
    adj.get(3).add(1);
    
    for(int i=1;i<=n;i++){
        for(int j=0;j<adj.get(i).size();j++){
            System.out.print(adj.get(i).get(j)+" ");
        }
        System.out.println();
    }
  

    }
}
