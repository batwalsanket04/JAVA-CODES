import java.io.*;
 class TringleSpace
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
     for(y=1;y<=n;y++)
        { 
        if(x==n||y==1||x==y)
          { 
           System.out.print("*");
          }
        else
          {
           System.out.print(" ");
          } 
        }
         System.out.print("\n");
        }
  }
}      