import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int fact = 1,i;
      Scanner s = new Scanner(System.in);
       int n = s.nextInt();
      for(i=1;i<=n;i++)
      {
        fact = fact*i;
      }
System.out.println(fact);
	}
}