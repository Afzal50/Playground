import java.util.Scanner;
import java.io.*;
class Main
{
    public static void main(String args[]) throws IOException
    {
      //Try your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s1 = br.readLine();
      String s2 = br.readLine();
      String[] res = s2.split(" ");
      for(int i=0;i<res.length;i++)
      {
        System.out.println(res[i]);
      }
    }
}