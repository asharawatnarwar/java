import java.util.*;
 class Main
{
    public static void main(String[] args) 
    {
        int a[];
        int i,size,search,count=0,replace;
        Scanner ob = new  Scanner (System.in);
        System.out.print("Enter the size of array:");
        size=ob.nextInt();
        a= new int [size];
        System.out.print("Enter the vlaue:");
        for(i=0;i<size;i++)
        {
            a[i]=ob.nextInt();
        }
        
               System.out.print("Enter search value:");
               search=ob.nextInt();
            for(i=0;i<size;i++)
            {
               if(a[i]==search)
               {
                   count++;
               }
            }
            System.out.println("count value :"+ count);
            
        System.out.println("Enter replace value:");
           replace=ob.nextInt();
           for(i=0;i<size;i++)
            {
               if(a[i]==search)
               {
                   a[i] = replace;
               }
            }
            for(i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
}