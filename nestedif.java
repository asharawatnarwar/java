import java.util.*;
class Demo{
    public static void main(String arr[])
    {
        float parcentage;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter your parcentage:=");
        parcentage = ob.nextFloat();
         
        if(parcentage >= 60)
        {
               System.out.print("First Division");
        }
        else if (parcentage >=45 && parcentage<60)
        {
            System.out.print("2nd Division ");
        }
        else if(parcentage <45 && parcentage>=36)
        {
            System.out.println("3rd");
        }else 
        {
            System.out.println("fall");
        }
    }
}