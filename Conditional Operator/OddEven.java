import java.util.*;
class OddEven
{
 public static void main(String args[])
{
 Scanner IN=new Scanner(System.in);

 int n;

 System.out.println("Enter The Number");
 n=IN.nextInt();

 System.out.println((n%2==0)? "No Is Even ": "No Is Odd");
}
}