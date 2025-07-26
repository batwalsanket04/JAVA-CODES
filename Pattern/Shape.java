import java.util.*;
 class Shapes
{
 public static void main(String args[])
{
 Scanner IN= new Scanner(System.in);
 
 int choice;
 double l,w,r,b,h,A,P,s,H,pi=3.14;

 System.out.println("\n 1.Rectaangle 2.Circle 3.Square 4.tringle");
 
 System.out.println("Enter Your Choice");
  
 choice= IN.nextInt();
 
 switch(choice)
       {
        case 1:
              {
               System.out.println("Enter Value of Length");
               l= IN.nextDouble();
               System.out.println("Enter Value of Width");
               w= IN.nextDouble();
               A= l*w;
               P= 2*(l+w);
               System.out.println("Area of Rectangle=" +A);
               System.out.println("Perimeter of Rectangle=" +P);
               break;
              }

        case 2:
              {
               System.out.println("Enter Value of r ");
               r= IN.nextDouble();
               A= pi*r*r;
               P= 2*pi*r;
               System.out.println("Area of Circle ="+A);
               System.out.println("Perimeter of Circle ="+P);
               break;
              }
        case 3:
              {
               System.out.println("Enter Value of s ");
               s= IN.nextDouble();
               A= s*s;
               P= 4*s;
               System.out.println("Area of Square="+A);
               System.out.println("Perimeter of Square="+P);
               break;
              }
        case 4:
              {
               System.out.println("Enter Value of b ");
               b= IN.nextDouble();
               System.out.println("Enter Value of h ");
               h= IN.nextDouble();
               A= (b*h)/2;
               H= Math.sqrt((b*h)+(h*h));
               P= b*h*H;
               System.out.println("Area of Tringle="+A);
               System.out.println("Perimeter of tringle="+P);
               System.out.println("Height of tringle="+H);
               break;
              }
         default:
                {
                 System.out.println("Incorrect Choice");
                }
       }
}
}