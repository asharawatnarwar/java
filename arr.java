import java.util.Scanner;
class Array
{
    public static void main(String hh[])
    {
       int a[],i;
    
      Scanner ob = new Scanner(System.in);
       for (i=0;i<=9;i++)
       {
          System.out.print("Enter the no.: ");
          a[i]=ob.nextInt();

       }
       for(i=0;i<=10;i++) 
       {
       System.out.println(a[i]);
       }
    }
}