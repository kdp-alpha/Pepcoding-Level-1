import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int div = 10;
     while(n!=0)
     {
         int rem = n % div;
         System.out.println(rem);
         n = n / div;
         
     }
    }
   }