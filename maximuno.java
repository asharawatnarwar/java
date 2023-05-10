import java.util.*;
class Demo
{
    public static void main(String arr[])
    {
        int a,b,c,d;
        Scanner ni = new Scanner(System.in);

        System.out.print("Enter the 1st no.");
        a = ni.nextInt();

        System.out.print("Enter the 2nd no.");
        b = ni.nextInt();

        System.out.print("Enter the 3rd no.");
        c = ni.nextInt();

        System.out.print("Enter the 4th no.");
        d = ni.nextInt();
    
        if(a>b)
        {
            if(a>c)
            {
            if(a>d)
        
        {
            System.out.println("maximum no."+a);
        }
    }
    }

       else if (b>a)
       
        if(b>c)
        {
       if(b>d)
        {
            System.out.println("maximum no."+b);
        }
      }
    
    else if(c>a)

        if(c>b)
        {
            if(c>d)
            {
                System.out.println("maximum no."+c);
            }
    }
        else
        {
            System.out.println("maximum no."+d);
        }
    }
}


