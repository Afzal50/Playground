import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int k=0;
      int temp = n,c=0;
      int test = n;
       while(temp!=0)
       {
         c++;
         temp/=10;
       }
      // System.out.println(c);
       while(n!=0)
       {
  		 int t = n%10;
         k += Math.pow(t,c);
         n/=10;
       }
      if(k==test)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");  
     
	}
}