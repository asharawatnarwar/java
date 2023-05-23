import java.util.Scanner;
public class Stringfunction
{
    static String largest (String x,String y)
    {
     if(x.length == y.length)
     {
        return "Both strings are equal";
     }
     else if (x.length > y.length)
     {
        return x;
     }
     else{
        return y;
     }
    }
    public static void public static void main(String[] args) {
        String st,str,temp;
     Scanner ob = new Scanner (System.in);
     System.out.print("Enter first String :");
     st = ob.next();
     System.out.print("Enter Second String.");
     str =ob.next();

     temp = largest(st,str);
     System.out.println(" "+temp);

    }
}