class Piramid
{
    public static void main(String arr[])
    {
        int i,j,k;
        for (i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=6-1;k>=i;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}