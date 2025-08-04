import java.util.*;
class Grade
{
 public static void main(String args[])
{
 Scanner IN=new Scanner(System.in);

 double a,b,c,d,e,T,P;

 System.out.println("Enter Five Subject Mark");
 a=IN.nextDouble();
 b=IN.nextDouble();
 c=IN.nextDouble();
 d=IN.nextDouble();
 e=IN.nextDouble();

 T=(a+b+c+d+e);
 P=(a+b+c+d+e)/500.0*100;

 if(P>80 && P<100)
   {
    System.out.println("A");
   }
 if(P>70 && P<80)
   {
    System.out.println("B");
   }
 if(P>60 && P<50)
   {
    System.out.println("C");
   }
 if(P>40 && P<50)
   {
    System.out.println("D");
   }
  System.out.println("Total Mark=" +T);
  System.out.println("Percentage Is=" +P);
}
}
 