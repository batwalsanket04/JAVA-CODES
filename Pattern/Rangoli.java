import java.io.*;
 class Rangoli
{
 public static void main(String args[])throws IOException
{
 InputStreamReader R=new InputStreamReader(System.in);
 BufferedReader B=new BufferedReader(R);
 
 int x,y,n;
 int n=n-1
 
 System.out.println("Enter NO of Lines");
 
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
    }

 for(x=1;x<=n;x++)
    {
     for(y=1;y<=x;y++)
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
}
      