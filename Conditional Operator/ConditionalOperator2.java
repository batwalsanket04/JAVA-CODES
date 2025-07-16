import java.util.*;
class ConditionalOperator2
{
 public static void main(String args[])
{
 Scanner IN=new Scanner(System.in);

 int m,n,y;

 System.out.println("Enter Value Of M");
 m=IN.nextInt();

 System.out.println("Enter Value Of N");
 n=IN.nextInt();

 y=(m>n)? m:n;

 System.out.println("Greater Value=" +y);
}
}
