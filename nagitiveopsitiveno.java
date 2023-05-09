import java.util.*;
class Demo
{
 public static void main (String arr[])
 {
    int a;
     Scanner ob = new Scanner (System.in);
    
    System.out.print("Enter a no.:");
    a = ob.nextInt();

    if ( a > 0)
         {
            System.out.println(" you enter Positive no.");
         }
         else if (a == 0 )
         {
            System.out.println("You enter Zero.");
         }
         else 
         {
            System.out.println("You enter Nagitive no.");
         }
 }
}