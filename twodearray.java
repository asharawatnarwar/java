class Twode
{
    public static void main(String brr[])
    {
        int a[][];
        a = new int[2][3];

        int b[][] = new int[4][5];

        int c[][] = new int[][]{{1,2,3}, {4,5,6}};
        
        int d[][] = {{1,2,3}, {4,5,6}};

        for(int i=0;i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        for(int i=0;i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        for(int i=0;i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        
        for(int i=0;i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(" " + d[i][j]);
            }
            System.out.println();
        }
    }
}