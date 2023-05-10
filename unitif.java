import java.util.*;
class Demo
{
    public static void main(String arr[])
    {
        int unit,t;
        Scanner ob = new Scanner (System.in);

        System.out.print("Enter the Unit:");
        unit = ob.nextInt();

        if(unit >=0 && unit <=50)
        {
            if(unit <50)
            System.out.println("Zero");
        }
        else if(unit >50 && unit <=200 )
        {
            t = unit-50*5;
            System.out.println("unit is " +t);
        }
        else if (unit > 200 && unit <=500)
        {
            t = unit * 8;
            System.out.println("unit is " +t);
        }
        else if (unit > 500)
        {
            t = unit * 10;
            System.out.println("unit is " +t);
        }
        else
        {
            System.out.println("Defult");
        }
    }
}
