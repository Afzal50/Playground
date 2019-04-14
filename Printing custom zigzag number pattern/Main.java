import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 int i,j,n;
Scanner s = new Scanner(System.in);
      n=s.nextInt();
for(i=1;i<=n;i++)
{
if(i%2!=0)
{
for(j=1;j<=n;j++)
{
if(j<n)
System.out.print(i);
else
System.out.print(i+1);
}
}
else if(i%2==0)
{
for(j=1;j<=n;j++)
{
if(j==1)
System.out.print(i+1);
else
System.out.print(i);
}
}
System.out.println();
}
     } 
   }
