import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int nsp = n - 1;
        int st = 1;
        
        for(int i=1;i<=n;i++)
        {
            
            for(int space =1; space<=nsp;space++)
            {
                System.out.print("	");
            }
            
            for(int j=1;j<=st;j++)
            {
                System.out.print("*	");
            }
            System.out.println();
            st++;
            nsp--;
        }

    }
}
