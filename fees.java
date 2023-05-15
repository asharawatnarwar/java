import java.util.Scanner;
class Fees
{
    public static void main (String arr [])
    {
        int choise,fees,mounth;
    
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter your  class .");
        choise = ob.nextInt();
        
        System.out.print("Enter  mounth pay fees .");
        mounth = ob.nextInt();

        switch (choise) {
            case 1:
            fees = mounth * 100;
            System.out.println("Result ="+fees);
             break;
             case 2:
             fees = mounth * 200;
            System.out.println("Result ="+fees);
             break;
             case 3:
            fees = mounth * 300;
            System.out.println("Result ="+fees);
             break;
             case 4:
             fees = mounth * 400;
             System.out.println("Result ="+fees);
             break;
             case 5:
             fees = mounth * 500;
             System.out.println("Result ="+fees);
             break;
             case 6:
             fees = mounth * 600;
             System.out.println("Result ="+fees);
             break;
             case 7:
             fees = mounth * 700;
             System.out.println("Result ="+fees);
             break;
             case 8:
             fees = mounth * 800;
             System.out.println("Result ="+fees);
             break;
             case 9:
             fees = mounth * 900;
             System.out.println("Result ="+fees);
             break;
             case 10:
             fees = mounth * 1000;
             System.out.println("Result ="+fees);
             break;
             case 11:
             fees = mounth * 1100;
             System.out.println("Result ="+fees);
             break;
             case 12:
             fees = mounth * 1200;
             System.out.println("Result ="+fees);
             break;
        
            default:
            System.out.println("no fees you are spical for me  :");
                break;

        }
    }
}