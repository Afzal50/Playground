import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    StringBuilder sb = new StringBuilder(str);
    StringBuilder sb1 = new StringBuilder(" ");
    int l = str.length();
    for(int i=0;i<l;i++)
    {
      if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u'  && str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U')
      {
        sb1.append(str.charAt(i));
      }
    }
    System.out.println(sb1.toString().trim());
        
  }
}