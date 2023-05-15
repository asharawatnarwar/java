import java.util.*;
class Prime 
{
    public static void main (String arr[])
    {
        int num,i=1,sum=0;
        Scanner ob =new Scanner(System.in);
        System.out.print("Enter the no.");
        num = ob.nextInt();

        while (i<=num )
        {
            if(num %i==0)
            sum++;
            i++;
        }
        if(sum==2)
        {
            System.out.println("Prime no.");
        }
        else 
        {
            System.out.println("not prime no.");
        }

    }
}