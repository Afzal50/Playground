import java.util.Scanner;
class Main
{
    public static int getsq(int n)
    {
		return n*n;
    }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner s  = new Scanner(System.in);
      int n = s.nextInt();
      int k = getsq(n);
      System.out.println(k);
	} 
}