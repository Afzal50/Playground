import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s = new Scanner(System.in);
      int b = s.nextInt();
      int e = s.nextInt();
      //System.out.println((int)(Math.pow(b,e)));
      int res = 1;
      while(e-->0)
      {
      	res *=b;
      }
      System.out.println(res);
    }
}