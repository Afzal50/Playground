import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner s = new Scanner(System.in);
      int count = s.nextInt();
      int i,j;
      for(i=1; i<=count; i++)
    {
        for(j=1; j<=count; j++)
        {
            if(j==i || (j==count - i + 1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
		System.out.println();
	}
}
}