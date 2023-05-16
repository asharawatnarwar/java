import java.util.Scanner;
class Renu
{
    public static void main(String arr[])
    {
        int i,n,fact=1;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a no");
        n=ob.nextInt();
        for(i=0;i<n;i++)
        fact=fact*i;
        {
            System.out.println("fact"+fact);
        }
    }
}