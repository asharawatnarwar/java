import java.util.*;
class Even
{
    public static void main (String arr[])
    {
        int a[] = new int [10];
        int i,ecount=0,ocount=0,sum=-0;
        float avg;
    
        Scanner ob = new Scanner(System.in); 
        for (i=0;i<=9;i++)
        {
            System.out.print("ENter a no.");
            a[i] = ob.nextInt();
        }
        for (i=0;i<=9;i++)
        {
            sum = sum+ a[i];
            if(a[i] % 2==0)
            ecount++;
            else 
            ocount++;
        }
        avg =sum/10;
        System.out.println("Sum = "+sum); 
        System.out.println("Even count = "+ecount); 
        System.out.println("Odd count = "+ocount); 
       System.out.println("Average  = "+avg); 

    }
}