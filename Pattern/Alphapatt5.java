import java.io.*;
 class Alphapatt5
{
 public static void main(String args[])throws IOException
{
 InputStreamReader R=new InputStreamReader(System.in);
 BufferedReader B=new BufferedReader(R);
 
 int x,y,n;
 char Alpha='E';
 
 System.out.println("Enter No of Lines");
 n=Integer.parseInt(B.readLine());

 Alpha='E';
 for(x=1;x<=n;x++)
    {
     for(y=1;y<=n-x+1;y++) 
        {
         System.out.print(Alpha);
         
        }
         System.out.print("\n");
         Alpha--;
        }
    
}
}