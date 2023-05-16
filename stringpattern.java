import java.util.*;
class Asha
{
    public static void main(String arr[])
    {
        int i,j,len;
        String st;
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter String .:. ");
        st = ob.nextLine();

        len = st.length();
        for (i=0;i<=len;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(st.charAt(j));
            }
            System.out.println();
        }
    }
}