import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int pos=0;
  int digit=0;
  int ans =0;
  while(n!=0)
  {
     digit = n % 10;
     pos++;
     int newpos = digit;
     int newdigit = pos;
     int power = (int)Math.pow(10,digit-1);
     ans = ans + (newdigit*power);
     n = n / 10;
     
  }
  System.out.println(ans);
 }
}
