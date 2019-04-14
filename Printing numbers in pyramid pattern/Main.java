import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int i,j;
      int num=1;
      for(i = 1; i <= n; i++) {
      for(j = 1; j <= n-i; j++)
         System.out.print(" ");

      for(j = 1; j <= i; j++) {
         System.out.print(num+" "); ++num; }

        System.out.println();
    }    
}
}