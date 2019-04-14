import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int[] a = new int[n];
      for(int i=0;i<n;i++)
        a[i] = s.nextInt();
      int k = s.nextInt();
      for(int i=0;i<n-1;i++)
        for(int j=0;j<n-i-1;j++)
        {
          if(a[j]<a[j+1])
          {
            int t = a[j];
            a[j]=a[j+1];
            a[j+1]=t;
          }
        }
      System.out.print(a[k-1]);
    }   
}