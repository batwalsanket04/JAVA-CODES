import java.util.*;
 class Unshaped
{
 public static void main(String args[])
{
 Scanner IN= new Scanner (System.in);

 double r,l,w,s,RA,CS,SA,SHADE;
 
 System.out.println("Enter value of r");
 
 r= IN.nextDouble();
 
 System.out.println("Enter value of l");
 
 l= IN.nextDouble();

 System.out.println("Enter value of w");
 
 w= IN.nextDouble();

 System.out.println("Enter valur of s");

 s= IN.nextDouble();
 
 RA= l*w;
 CS= (90*3.14*r*r)/360;
 SA= s*s;

 System.out.println("value of rectangle area="+RA);
 System.out.println("value of circuler section="+CS);
 System.out.println("value of square area="+SA);
}
}
