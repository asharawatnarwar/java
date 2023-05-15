import java.util.*;
class Demo{
    public static void main(String arr[])
    {
        int a,i;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a no.");
        a =ob.nextInt();

        for (i=1;i<=10 ;i++)

        {
            System.out.println(a+ "*" +i+ "=" +a * i);
        }
    }
}