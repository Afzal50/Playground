import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i,fact=1;  
    fact = factorial(n);   
    System.out.println(fact);    
    
  }
  public static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
}