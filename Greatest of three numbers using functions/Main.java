import java.util.Scanner;
class Main{
    public static int getGreatest(int a,int b,int c)
    {
      int big = a > b ? ( a > c ? a : c) : (b > c ? b : c) ;
      return big;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int n1= s.nextInt();
      int n2 = s.nextInt();
      int res = getGreatest(n,n1,n2);
      System.out.println(res);
      
	}
}