import java.util.*;
class Demo
{
    public static void main(String arr[])
    {
        char a;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter a charter.:");
        a = ob.next().charAt(0);
        
        switch(a)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'i':
            case 'e':
            case 'o':
            case 'u':
            System.out.println("vowel" +a);
            break;
           
            default:
            System.out.println("cnsonent.:");
            break;
        }
        
    }
}