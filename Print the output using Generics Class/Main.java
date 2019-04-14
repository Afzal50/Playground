import java.util.*;
public class Main<T> 
{
     private T t;
     public void insert(T t) 
     {
     this.t = t;
     }
     public T get() 
     {
     return t;
     }
     
     public static void main(String[] args) 
     {   
         Scanner sc1 = new Scanner(System.in);     
         Main<Integer> in = new Main<Integer>();
         int num = sc1.nextInt();
         in.insert(num);    
         Main<String> str = new Main<String>();
         String str1 = sc1.next();
         str.insert(str1);   
         Main<Float>  fl = new Main<Float>();
         float f = sc1.nextFloat();
         fl.insert(f);
         System.out.println("Integer Value: " + in.get());
         System.out.println("String Value: " + str.get());
         System.out.println("Float value: " + fl.get());
    }
}