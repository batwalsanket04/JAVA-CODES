import java.io.*;
 class Alphapatt3
{ 
 public static void main(String args[])throws IOException
{
 InputStreamReader R=new InputStreamReader(System.in);
 BufferedReader B=new BufferedReader(R);
 
 char Alpha='A';
 int x,y,n;
 
 System.out.println("Enter No Of Lines");
 n=Integer.parseInt(B.readLine());
 
 for(x=1;x<=n;x++)
    {
     Alpha='A';

     for(y=1;y<=x;y++)
        {
         System.out.print(Alpha);
         Alpha++;
        }
         System.out.print("\n");
        }
    
}
}