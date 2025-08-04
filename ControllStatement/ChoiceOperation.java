import java.util.*;
class choiseOperation
{
 public static void main(String args[])
{
 int ch;

 Scanner IN=new Scanner(System.in);

 System.out.println("1.Addition\n 2.Substraction\n 3.Multiplication \n 4.Division");

 System.out.println("Enter Your Choise");
 ch=IN.nextInt();

 if(ch==1)
   {
    System.out.println("Enter Two Value");
    int a=IN.nextInt();
    int b=IN.nextInt();
    int c=a+b;
   }
 
 if(ch==2)
   {
    System.out.println("Enter Two Value");
    int a=IN.nextInt();
    int b=IN.nextInt();
    int c=a-b;
   }
 if(ch==3)
   {
    System.out.println("Enter Two Value");
    int a=IN.nextInt();
    int b=IN.nextInt();
    int c=a*b;
   }
 
 if(ch==4)
   {
    System.out.println("Enter Two Value");
    int a=IN.nextInt();
    int b=IN.nextInt();
    int c=a/b;
   }
 else
   {
    System.out.println("Incorrect Choise Try Later...");
   }
}
}


