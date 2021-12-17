/*

0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	



*/



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+"	");
                int c= a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }

    }
}
