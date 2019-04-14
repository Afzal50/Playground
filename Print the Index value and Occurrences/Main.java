import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String patternString = sc.nextLine();
        String text = sc.nextLine();
        Pattern p = Pattern.compile(patternString);
        Matcher m = p.matcher(text);
        int count = 0;
        while(m.find()) {
            count++;
           System.out.println("found: " + count + " : "+ m.start() + " - " + m.end());
           }
           if(count == 0)
           System.out.println("The given word is not present in the string");
           else
           System.out.println(count);
    }
}