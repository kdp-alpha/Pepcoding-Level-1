import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int st = n;
        int sp = 0;
        
        for(int i=1;i<=n;i++)
        {
            for(int space = 1; space<=sp;space++)
            {
                System.out.print("	");
            }
            
            for(int j = 1; j<=st;j++)
            {
                System.out.print("*	");
            }
            System.out.println();
            st--;
            sp++;
        }

    }
}
