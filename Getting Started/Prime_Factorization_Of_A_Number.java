import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here
  Scanner scn = new Scanner(System.in);
  
  int n = scn.nextInt();
  
  
  for(int divisor=2; divisor*divisor<=n;divisor++)
  {
      while(n % divisor==0)
    {
        System.out.print(divisor+" ");
       n = n / divisor;
    }
      
  }
  if(n!=1)
  {
      System.out.println(n);
  }
   
 }
}
