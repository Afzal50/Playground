import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int i =1;
       int c=0;
   while( i<1000)
   {
     if(i%2!=0)
     {
		System.out.println(i);
        c++;
     }
     if(c==n)
     {
       break;
     }
     i++;
   }
      }
      }
	
