import java.util.*;
class Demo
{
 public static void main (String arr[])
 {
    String a;
     Scanner ob = new Scanner (System.in);
    
    System.out.print("Enter a no.:");
    a = ob.next();

    if ( a == "a" || a=="u" || a=="i" || a=="o" || a=="e"|| a == "A" || a=="U" || a=="I" || a=="O" || a=="E" )
         {
            System.out.println(" you enter Positive no.");
         }
      
         else 
         {
            System.out.println("You enter consonent.");
         }
 }
}