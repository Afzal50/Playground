import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner s = new Scanner(System.in);
    String ms,ss;
    int c=1,i,j;
    ms = s.nextLine();
    ss = s.nextLine();
    int l1=ms.length();
    int l2=ss.length();
    for(i=0;i<(l1-l2);i++)
    {
		for(j=0;j<l2;j++)
        {
          if(ms.charAt(i+j)!=ss.charAt(j))
          {
            break;
          }
        }
          if(j==l2)
          {
            c++;
            j=0;
          }

    }
    System.out.println(c);
  } 
}