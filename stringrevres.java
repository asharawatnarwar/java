import java.util.Scanner;
class rev
{
    public static void main(String arr[])
   
    {
        String st;
        int len,i;
        Scanner ob=new Scanner(System.in);
        System.out.print("enter a string");
       st = ob.nextLine();
        len=st.length();
         for (i = len-1; i>=0;i--)
{
    System.out.println(  st.charAt(i));
}

    }
}