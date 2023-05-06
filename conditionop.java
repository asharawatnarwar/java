import java.util.*;
 class Demo
{
    public static void main(String arr[])

{
  int a,b,result;
   Scanner ob =new Scanner (System.in);
   System.out.print("Enter the first number: ");
   a = ob.nextInt();
    System.out.print("Enter the second no.");
    b = ob.nextInt();

    result= a>b ? a:b ;
    System.out.print("largest no is:=." +result);

}
}
