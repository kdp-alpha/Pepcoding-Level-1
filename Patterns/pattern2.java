import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int temp = n;
        
        for(int i=0;i<n;i++)
        {
            for(int j=temp;j>0;j--)
            {
                System.out.print("*	");
            }
            
            System.out.println();
            temp--;
        }

    }
}
