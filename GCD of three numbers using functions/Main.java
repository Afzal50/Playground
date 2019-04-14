import java.util.Scanner;
public class Main{
    public static int getGCD(int a,int b,int c)
    {
      int gcd = 1;
      for(int i=1 ; i<=a && i<=b && i<=c ; i++)
      {
		if(a%i==0 && b%i==0 && c%i==0)
        {
          gcd = i;
        }
      }
      return gcd;
    }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int a = s.nextInt(); int b = s.nextInt(); int c = s.nextInt();
      int res = getGCD(a,b,c);
      System.out.println(res);
	}
}