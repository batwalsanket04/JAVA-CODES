import java.util.*;
class LogineResult
{
 public static void main(String args[])
{
 int Up,Sp=1234;

 int a=0,b=0,c=0,d=0,t=0,p=0;

 Scanner IN=new Scanner(System.in);

 System.out.println("Enter The Password");
 Up=IN.nextInt();

if(Sp==Up)
   {

    System.out.println("Correct Password Your Successfully Logine");

 System.out.println("Enter Four Subject Mark");
 a=IN.nextInt();
 b=IN.nextInt();
 c=IN.nextInt();
 d=IN.nextInt();

 t=(a+b+c+d);
 p=t*100/400;



if(a>70 && b>70 && c>70 && d>70)
  {
   System.out.println("Total=" +t);
   System.out.println("Percentage=" +p);
   System.out.println("You Achive Highest Mark");
  }

if(a<50 && b<50 && c<50 && d<50)
  {
   System.out.println("Total=" +t);
   System.out.println("Percentage=" +p);
   System.out.println("You Achive Lowest Mark");
  }
}
else
   {
    System.out.println("Please Check Your Password");
   }

if(a==0)
{
}
else
 {
  System.out.println("Incorrest Choice Please Try Again..");
 }

}
}
 