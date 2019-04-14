import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int base = s.nextInt();
      int exponent = s.nextInt();
      int res = (int)Math.pow(base,exponent);
      System.out.println(res);
     }
   /*public static int getres(int base,int exponent)
   {
     int i = 1;
     int k=0;
     while(i<=exponent)
     {
       k=base*base;
       i++;
     }
     return k;
   }  */    
}