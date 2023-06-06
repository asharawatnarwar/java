public class sumof2darray {
    public static void main(String arr[])
    {
        int a[][] = {{1,2,3},{4,5,6}};
        int b[][] = {{11,12,13},{14,15,16}};
        int w[][];
         w = fun(a,b);
         for(int i=0;i<w.lenght;i++)
         {
            for(int j=0;j<w[i].length;j++)
            {
                System.out.print(w[i][j]);
            }
            System.out.println();
         }
    }
    static int [][] fun(int x[][],int y[][])
    {
        int tmp [][] = new int [2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                tmp [i][j]= x[i][j]+y[i][j];

            }
        }
        return tmp;
    }
    
}
