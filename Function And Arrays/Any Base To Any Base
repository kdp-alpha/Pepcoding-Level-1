import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int decimal_value = givenBaseToDecimal(n,sourceBase);
     int final_value = givenBaseToDestination(decimal_value,destBase);
     System.out.println(final_value);
   }
   
   public static int givenBaseToDecimal(int n ,int sourceBase){
       int ans = 0;
       int count = 0;
       
       while(n!=0)
       {
           int rem = n % 10;
           ans = ans + rem * (int)Math.pow(sourceBase,count);
           n/=10;
           count++;
       }
       return ans;
   }
   public static int givenBaseToDestination(int n ,int destBase){
       int val = 0;
       int count = 0;
       
       while(n!=0)
       {
           int rem = n % destBase;
           val = val + rem * (int)Math.pow(10,count);
           n/=destBase;
           count++;
       }
       return val;
   }
  }
