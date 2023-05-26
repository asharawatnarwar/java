import java.util.*;
  class Largest
{ 
    public static void main(String arr[])
    {
        int num1,num2 ,larg,small;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the 1st no.");
        num1 = ob.nextInt();
        System.out.print("Enter the 2nd no.");
        num2 = ob.nextInt();

        larg = largest( num1,num2);
        small = smallest(num1,num2);
    }
    static int largest(int a,int b)
    {
        if(a > b)
        
            return a;
        
        else
        
            return b;
        
        static int smallest(int x,int y)
        {
            if(x < y)
            
                return x;
            
            else
            
                return y;
            
    }
}
}