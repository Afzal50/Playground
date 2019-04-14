import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     int sum = 0,i,n;
         Scanner s = new Scanner(System.in);
         n=s.nextInt();
         for(i=1;i<=n;i++)
         {
			sum = sum + i;
         }
      System.out.println(sum);
	}
}