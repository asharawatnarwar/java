import java.util.*;
class Demo
{
    public static void main(String arr[])
    {
        int  a;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter the day .:");
        a = ob.nextInt();
        
        switch(a)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tusday");
            break;
            case 3:
            System.out.println("wensday");
            break;
            case 4:
            System.out.println("Tharsday");
            break;
            case 5:
            System.out.println("Fraiday");
            break;
            case 6:
            System.out.println("satday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
           
            default:
            System.out.println("not valid.:");
            break;
        }
        
    }
}