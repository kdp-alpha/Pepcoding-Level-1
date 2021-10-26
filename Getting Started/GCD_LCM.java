import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int a = scn.nextInt();
      int b = scn.nextInt();
      int divisor = a;
      int dividend = b;
      while(dividend % divisor !=0)
      {
          int remainder = dividend % divisor;
          dividend = divisor;
          divisor = remainder;
      }
      int gcd = divisor;
      System.out.println(gcd);
      int lcm = (a * b) / gcd;
      System.out.println(lcm);
     }
    }
