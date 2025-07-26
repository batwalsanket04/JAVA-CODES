import java.io.*;
class Decsending1
{
 public static void main(String args[])throws IOException
{
 InputStreamReader R= new InputStreamReader(System.in);
 BufferedReader B= new BufferedReader(R);
 
 int x,y,n;
 
 System.out.println("Enter NO of Lines");
 
 n= Integer.parseInt(B.readLine());
 
 for(x=1;x<=n;x++)
    { 
     for(y=1;y<=n-x+1;y++)
        { 
         System.out.print(y);
         
        }
         System.out.print("\n");
    }
}

}