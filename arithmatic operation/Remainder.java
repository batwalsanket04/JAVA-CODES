import java.util.*;
class Remainder
{
 public static void main(String args[])
{
 int n=100;

 for(int i=1;i<n;i++)
 {
  int f=1;
 for(int j=2;j<i;j++)
 {
  if(i%j==0)
    {
     f=0;
     break;
    }
 }

 if(f==1)
   {
    System.out.println(i+ " ");
   }
}
}
}
