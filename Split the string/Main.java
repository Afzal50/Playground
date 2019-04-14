import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        Pattern ptn = Pattern.compile("(,| |and|or)");        
        String[] parts = ptn.split(str1);
        for(String p:parts){
            System.out.println(p);
        }  
       
    }
}