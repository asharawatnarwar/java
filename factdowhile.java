import java.util.*;
class Factorial
{
    public static void main (String arr[])
    {
        int num, i=1, factorial=1;
        Scanner ob =new Scanner(System.in);
        
        System.out.print("Enter the no.");
        num = ob.nextInt();

        do
          {
            factorial = factorial * i;
            i++;
           
          }
           while(i <=num);
          System.out.println("Factorial is =" +factorial);
    }
}
