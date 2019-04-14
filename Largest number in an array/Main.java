import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
            int[] a = new int[100];
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int i;
      for(i=0;i<n;i++)
      {
          a[i] = s.nextInt();
      }
      int max = a[0];
      for(i=0;i<n;i++)
      {
          if(max < a[i])
            max = a[i];
      }
      System.out.println(max);
    }
}