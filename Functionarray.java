import java.util.*;
public class Functionarray {
 public static void main(String arr[])
 {
    String st[] =new String[5];
    Scanner ob = new Scanner(System.in);
    for(int i =0;i<4;i++)
    {
    System.out.println("Enter the string");
    st[i]=ob.next();
    }
    fun(st);
 }
 static String fun(String a[])

    {
        for(int i=4;i>0;i--)

    

    System.out.println(a[i]+" ");
    }

    
}
