import java.util.*;
 class Addition
{
 public static void main (String arrgs[])
{
 Scanner IN= new Scanner(System.in);

 int m,n,p,q,x=0,y=0;

 System.out.println("Enter value of m");
 
 m= IN.nextInt();

 System.out.println("Enter value of n");

 n= IN.nextInt();

 System.out.println((x%2==0)? "Addition is even":"Addition is odd");
 
 System.out.println("Enter value of q");

 p= IN.nextInt();

 System.out.println("Enter value of q");

 q= IN.nextInt();

 System.out.println((y%2==0)? "Addition is even":"Addition is odd");


 x= m+n;

 y= p+q;

 System.out.println("Additon of x="+x);

 System.out.println("Addition of y="+y);


}
}


  