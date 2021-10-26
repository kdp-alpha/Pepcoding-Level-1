import java.util.*;
   
   public class Main{
     
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp = n;
        int nod = 0;
        
        
        
        while(temp!=0)
        {
            temp = temp / 10;
            nod++;
        }
        k = k % nod;
        if(k<0)
        {
            k = k + nod;
        }
        
        int div = (int)Math.pow(10,k);
        
        int q = n / div;
        int rem = n % div;
        
   
    
        
        int mult = (int)Math.pow(10,nod-k);
        
        int ans = (rem * mult)+q;
       
       System.out.println(ans);
    }
    
    
   }
