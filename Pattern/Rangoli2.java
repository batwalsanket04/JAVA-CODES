import java.io.*;
 class Rangoli2
{
 public static void main(String args[])throws IOException
{
 InputStreamReader R=new InputStreamReader(System.in);
 BufferedReader B=new BufferedReader(R);
 
 int x,y,n;
 
 System.out.println("Enter No of Lines");
 
 n=Integer.parseInt(B.readLine());
  
 for(x=1;x<=n;x++)
    {
     for(y=1;y<=n-x+1;y++)
        { 
         System.out.print(" ");
        }
     for(y=1;y<=2*x-1;y++)
        {
         System.out.print("*");
        }
         System.out.print("\n");
        }
 n=n-1;

 for(x=1;x<=n;x++)
    {
     for(y=1;y<=x+1;y++)
        {
         System.out.print(" ");
        }
     for(y=1;y<=2*(n-x)+1;y++)
        {
         System.out.print("*");
        }
         System.out.print("\n");
        }
    
}
}
      