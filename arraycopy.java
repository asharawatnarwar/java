class Copy
{
    public static void main(String arr[])
    {
        int a[]={2,3,5,4,6,8,7,68,9};
        int b[]=new int [10];
        int c[]=new int [10];

        System.arraycopy(a,0,b,0,3);
        for(int i:b)
        System.out.println(i);
        System.arraycopy(a,2,c,5,4);

        for(int i:c)
        System.out.print(i+" ");
    }
}