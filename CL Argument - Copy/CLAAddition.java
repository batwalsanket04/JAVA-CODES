class CLAAddition
{
 public static void main(String args[])
{
 int t=0;
 int i;
 
 for(i=0;i<args.length;i++)
    {
     t=t+Integer.parseInt(args[i]);
     
    }
     System.out.println(t);
}
}