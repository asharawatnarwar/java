class Pattern
{
    public static void main(String arr[])
    {
        int i,j,sum;
        for (i=1;i<=6;i++)
        {
            for (j=1;j<=i;j++)
            {
                sum=i+j;
                if(sum % 2==0)
            {
                System.out.print("1");
            }
            else
            {
            System.out.print("0");
            }
         }
         System.out.println();
       }
     }
}