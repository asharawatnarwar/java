import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
        int a[];
        int i,size,search,count=0;
        Scanner ob = new  Scanner (System.in);
        System.out.print("Enter the size of array:");
        size=ob.nextInt();
        a= new int [size];
        System.out.print("Enter the vlaue:");
        for(i=0;i<size;i++)
        {
            a[i]=ob.nextInt();
        }
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
               System.out.println("Enter search value:");
               search=ob.nextInt();
            for(i=0;i<size;i++)
            {
               if(a[i]==search)
               {
                   count++;
               }
            }
            System.out.print("count value :"+ count);
        
    }
}