import java.util.Scanner;
class Demo
{
    public static void main(String arr[])
   
    {
        String st;
        int len;
        Scanner ob=new Scanner(System.in);
        System.out .print("enter a string");
       st = ob.next();
         len=st.length();
         for (int i = 0; i<=len;i++)
{
    System.out .println(st.charAt(i));
}

    }
}