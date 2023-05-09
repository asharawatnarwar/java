import java.util.*;
class Demo
{
    public static void main(String arr[])
    {
        int a;
        Scanner ni = new Scanner(System.in);

        System.out.print("Enter the 1st no.");
        a = ni.nextInt();
    
        if(a % 2 == 0)
        {
            System.out.println("EVEN");
        }
        else
        {
            System.out.println("ODD");
        }
    }
}