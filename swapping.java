import java.util.*;
class Demo
{
    public static void main(String arr[])
{
    int a,b;

    Scanner ab = new Scanner(System.in);
     System.out.println("Befour Swapping ");

     System.out.print("Enter the value of a :-");
     a = ab.nextInt();
     System.out.print("Enter the value of b :-");
     b = ab.nextInt();

     c=a;
     a=b;
     b=c;

     System.out.println("After Swapping");
     System.out.println("value of a is =" +a);
     System.out.print("value of b is =" +b);
      
}
}