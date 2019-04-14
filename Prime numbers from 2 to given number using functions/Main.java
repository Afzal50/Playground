import java.util.Scanner;
class Main{
  public static int getPrime(int n)
	{
    int j, flag = 1;
    for(j=2; j <= n/2; ++j)
    {
        if (n%j == 0)
        {
            flag =0;
            break;
        }
    }
    return flag;
}
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int flag;
      for(int i=2; i<n; ++i)
    	{
        flag = getPrime(i);
        if(flag == 1)
            System.out.println(i);
   		 }
	}
}