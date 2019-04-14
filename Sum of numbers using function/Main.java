import java.util.Scanner;
class Main{
    public static int getSum(int n)
    { 
      int s=0,i=1;
      while(i<=n)
      {
        s=s+i;
        i++;
      }
      return s;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int k = getSum(n);
      System.out.println(k);
	}
}