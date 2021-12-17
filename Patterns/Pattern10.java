/*

		*	
	*		*	
*				*	
	*		*	
		*	


*/


import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int os = n / 2;
     int is = -1;
     int st = 1;
     for(int i=1; i<=n; i++)
     {
         for(int space=1; space<=os;space++)
         {
             System.out.print("	");
         }
         System.out.print("*	");
         
         for(int j=1;j<=is;j++)
         {
             System.out.print("	");
         }
         
         if(i>1 && i<n)
         {
             System.out.print("*	");
         }
         
         System.out.println();
         
         if(i<(n/2)+1)
         {
             os--;
             is+=2; // becuz is starts with -1
         }
         else
         {
             os++;
             is-=2;
         }
     }

 }
}
