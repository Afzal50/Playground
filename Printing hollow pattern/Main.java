import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner s = new Scanner(System.in);
      int N = s.nextInt();
      int i,j;
     for(i=1; i<=N; i++)
    {
        /* Iterate over each column */
        for(j=1; j<=N; j++)
        {
            if(i==1 || i==N || j==1 || j==N)
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