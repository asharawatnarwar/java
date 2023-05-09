import java.util.*;
class Demo
{
    public static void main(String arr[])
    {
        int a,b;
        Scanner ni = new Scanner(System.in);
        System.out.print("Enter the 1st no.");
        a = ni.nextInt();
    
        System.out.print("Enterthe 2nd no.");
        b = ni.nextInt();
        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}