import java.util.*;
class Demo 
{
    public static void main (String arr[])
    {
        int num, i, factorial=1;
        Scanner ob =new Scanner(System.in);
        
        System.out.print("Enter the no.");
        num = ob.nextInt();

        for (i =1; i<=num;i++)
         factorial = factorial * i;
          {
           
            System.out.println("Factorial is =" +factorial);
          }
    }
}
