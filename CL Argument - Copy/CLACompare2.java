class CLACompare2
{
 public static void main(String args[])
{
 int A,B,C;
 
 A=Integer.parseInt(args[0]);
 B=Integer.parseInt(args[1]);
 C=Integer.parseInt(args[2]);

 if(A<B)
   {
    if(A<C)
      {
       System.out.println("A");
      }
    else
      { 
       System.out.println("C");
      }
    }
  else
    {
     if(B<C)
       {
        System.out.println("B");
       }
     else
       {
        System.out.println("C");
       }
    }
}
}

