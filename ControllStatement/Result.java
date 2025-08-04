import java.util.*;
class Result
{
 public static void main(String args[])
{
 Scanner IN=new Scanner(System.in);

  int Math,Sci,Java,c,html;

 System.out.println("Enter Five Subject Mark");
 Math=IN.nextInt();
 Sci=IN.nextInt();
 Java=IN.nextInt();
 c=IN.nextInt();
 html=IN.nextInt();

 if(Math>35&&Sci>35&&Java>35&&c>35&&html>35)
{
 System.out.println("Congrats Your Pass");
}

 else
{
 System.out.println("Your Result Is  Fail");
}
 if(Math<35)
   {
    System.out.println("Math Is Fail");
   }
 if(Sci<35)
   {
    System.out.println("Science Fail ");
   }
 if(Java<35)
   {
    System.out.println("Java Is fail");
   }
 if(c<35)
   {
    System.out.println("c Is Fail");
   }

 if(html<35)
   {
    System.out.println("html Is Fail");
   }

}
}
