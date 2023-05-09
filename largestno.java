import java.util.*;
class Demo
{
    public static void main(String arr[])
    {
        int a,b,c;
        Scanner ni = new Scanner(System.in);

        System.out.print("Enter the 1st no.");
        a = ni.nextInt();

        System.out.print("Enter the 2nd no.");
        b = ni.nextInt();

        System.out.print("Enter the 3rd no.");
        c = ni.nextInt();
    
        if(a>b)
        {
            if(a>c)
        
        {
            System.out.println(a);
        }
    }

       else if (b>a)
       {
        if(a>c)
    
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}
}
