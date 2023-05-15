import java.util.*;
class prime 
{
    public static void main(String arr[])
    {
        int num , i=1,sum=0;
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter the  no.");
        num = ob.nextInt();

        do
        {
            if(num %i==0)
            sum++;
            i++;
        }
        while(num <= 10);
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