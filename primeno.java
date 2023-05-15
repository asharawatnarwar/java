import java.util.*;
class Prime 
{
    public static void main (String arr[])
    {
        int num,i,sum=0;
        Scanner ob =new Scanner(System.in);
        System.out.print("Enter the no.");
        num = ob.nextInt();

        for (i=1; i<=num ; i++)
        {
            if(num %i==0)
            sum++;
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