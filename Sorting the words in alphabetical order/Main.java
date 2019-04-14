import java.util.Scanner;
import java.util.Arrays;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String[] str = new String[n];
    for(int i=0;i<n;i++)
      str[i]=s.next();
    char[] ch = new char[n];
    for(int i=0;i<n;i++)
      ch[i] = str[i].charAt(0);
    Arrays.sort(str);
    for(int i=0;i<n;i++)
      System.out.println(str[i].toLowerCase());
    
  }
}