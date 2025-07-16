import java.util.*;
class ControlStatement
{
 public static void main(String args[])
{
 Scanner IN=new Scanner(System.in);

 int a,b,c;

 System.out.println("Enter Value Of A,B,C");
 a=IN.nextInt();
 b=IN.nextInt();
 c=IN.nextInt();

 if(a>b && a>c)
{
 System.out.println(a+ "Is Greater");
}
 
if(b>a && b>c)
{
 System.out.println(b+" Is Greater");
}

if(c>a && c>b)
{
 System.out.println(c+ " Is greater");
}
  