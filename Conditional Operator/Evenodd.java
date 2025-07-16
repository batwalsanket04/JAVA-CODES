import java.util.*;
 class Evenodd
{
 public static void main(String args[])
{
 Scanner IN= new Scanner(System.in);

 int n;

 System.out.println("Enter value of n");
 
 n= IN.nextInt();

 System.out.println((n%2==0)? "No is even":"No is odd");
}
}