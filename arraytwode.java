public class arraytwode {
    public static void main(String arr[])
    {
        int a[] [] ={{1,2,3},{4,5,6}}
        int b[] [] ;
        b = fun(a);
        
        for(int i=0;i<b.lenght;i++)
        {
            for(int j=0;j<b[i].length;j++);
            {
              System.out.println(" "+b[i][j]);
            }
            System.out.println();
        }
    }
    static  int [] [] fun (int x[][])
    {
        int t[][]=new int [2][3];
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++);
            {
                t[i][j]=x[i][j]+1;
            }
        }
        return t;
    }
}
    
