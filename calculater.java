import java.util.Scanner;
class Demo
{
    public static void main (String arr [])
    {
        int a,b , result;
        char chouse;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter first no .");
        a = ob.nextInt();
        
        System.out.print("Enter  Second no .");
        b = ob.nextInt();

        System.out.print("chouse the oprestion : + , - , * ,/ ,% ");
     

        System.out.print("Enter your chouse: ");
        chouse =ob.next().charAt(0);

        switch (chouse) {
            case '+':
            result = a+b;
            System.out.println("Result ="+result);
             break;
            case '-':
            result = a-b;
            System.out.println("Result ="+result);
             break;
             case '*':
            result = a*b;
            System.out.println("Result ="+result);
             break;
             case '/':
             result = a/b;
             System.out.println("Result ="+result);
             break;
             case '%':
             result = a%b;
             System.out.println("Result ="+result);
             break;
        
            default:
            System.out.println("no valid :");
                break;
        }
    }
}