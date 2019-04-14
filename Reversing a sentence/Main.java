import java.util.Scanner;
import java.util.regex.Pattern; 
class Main{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      String s1 = s.nextLine();
      Pattern pattern = Pattern.compile("\\s");      
        String[] temp = pattern.split(s1); 
        String result = ""; 
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        }
      System.out.println(result);
    }
}
 