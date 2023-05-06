import java.util.Scanner;
class Demo
{
    public static void main(String arr[])
    {
        int a,b,result;
        Scanner ob = new Scanner (System.in);
        System.out.print("Enter the 1st no.");
        a = ob.nextInt();
        System.out.print("Enter 2nd no.");
        b = ob.nextInt();

        result = a+b;
        System.out.println("Sum :=" +result);
        result = a-b;
        System.out.println("Differinc :=" +result);
        result = a*b;
        System.out.println("Multiplay :=" +result);
        result = a/b;
        System.out.println("Division :=" +result);
        result = a%b;
        System.out.println("Rementer :=" +result);

    }
}