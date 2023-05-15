import java.util.*;
class Demo
{
    public static void main (String arr[])
    {
        int num, i,sum = 0;
        Scanner ob =new Scanner(System.in);
        for(i=1;i<=10;i++)
        
        System.out.print("Enter the no.");
        num= ob.nextInt();

        sum = sum + num;
        System.out.print("sum= "+sum); 
    }
}
