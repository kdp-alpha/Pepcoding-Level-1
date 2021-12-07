import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int sp = n - 1;
        
        for(int i=1; i<=n; i++)
        {
            for(int space = 1; space<=sp; space++)
            {
                System.out.print("	");
            }
            
            System.out.print("*");
            
            System.out.println();
            sp--;
        }

    }
}
