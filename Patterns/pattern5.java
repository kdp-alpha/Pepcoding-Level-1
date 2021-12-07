import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int st = 1;
        int sp = n/2;
        
        for(int i=1;i<=n;i++)
        {
           for(int space = 1; space<=sp; space++)
           {
               System.out.print("	");
           }
           
           for(int j = 1;j<=st;j++)
           {
               System.out.print("*	");
           }
           
           System.out.println();
           
           if(i<(n/2)+1)
           {
               st = st+2;
               sp--;
           }
           else
           {
               st = st -2;
               sp++;
           }
           
           
            
        }

    }
}
