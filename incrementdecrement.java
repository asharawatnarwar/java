import java.util.Scanner;
class Demo 
{
    public static void main (String arr[])
    {
        int a = 10, b;
     
          b = a++;
     System.out.println("a = " + a);
     System.out.println("b = " + b);
     a = 10;
     b = ++a;
     System.out.println("a = " + a);
     System.out.println("b = " + b);
     a = 10;
     b = a--;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
     a = 10;
     b = --a;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    
    }
}