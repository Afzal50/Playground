import java.util.Scanner;
class Main{
  public static int search(int arr[], int x) 
{ 
    int n = arr.length; 
    for(int i = 0; i < n; i++) 
    { 
        if(arr[i] == x) 
            return i; 
    } 
    return -1; 
} 
    public static void main(String args[]){
        int arr[] = new int[100];  
      Scanner s = new Scanner(System.in);
     
      int n = s.nextInt();
       for(int i = 0; i < n ; i++)
      {
          arr[i] = s.nextInt();
      }
    int x = s.nextInt(); 
    int res = s.nextInt();
      
    int result = search(arr, x); 
    int res1 = search(arr,res);
    if(result == -1) 
        System.out.println("-1"); 
    else
        System.out.println( result); 
        if(res1 == -1) 
        System.out.println("-1"); 
    else
        System.out.println( res1);
    }
}