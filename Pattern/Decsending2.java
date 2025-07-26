import java.io.*;
class Decsending2
{
 public static void main(String args[])throws IOException
{ 
 InputStreamReader R= new InputStreamReader(System.in);
 BufferedReader B= new BufferedReader(R);

 int x,n,y;
 
 System.out.println("Enter No of Element");
 n=Integer.parseInt(B.readLine());
 
 for(x=1;x<=n;x++)
    {
     for(y=1;y<=n-x+1;y++)
        {
         System.out.print(n-y+1);
        }
         System.out.print("\n");

    }
}
}