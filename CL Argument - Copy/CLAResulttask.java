class CLAResulttask
{
 public static void main(String args[])
{
 int t=0,i;
 double p=0;
 
 for(i=0;i<args.length;i++)
    {
     t=t+Integer.parseInt(args[i]);
    }
     p=(t/500.0)*100;

     System.out.println(t);

     System.out.println(p);

     if(Integer.parseInt(args[0])>=35&&Integer.parseInt(args[0])>=35&&Integer.parseInt(args[0])>=35&&Integer.parseInt(args[0])>=35)
      {
       System.out.println("congrats your Pass");
      }
     else
      {
       System.out.println("Your Fail");
      }

 }
}