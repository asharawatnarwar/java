import java.util.*;
class Demo 
{
  public static void main(String arr[])
  {
    float hindi,english,math,totle,par;
     Scanner ob = new Scanner (System.in);
      
     System.out.println("Enter hindi maks:-");
     hindi=ob.nextFloat();
     System.out.println("Enter english marks:-");
     english=ob.nextFloat();
     System.out.println("Enter math marks:-");
     math=ob.nextFloat();

   totle=hindi*english*math;
   par=totle*100/300
    System.out.println("Totle marks=" +totle);
    System.out.println("Parsentage  =" +par);
    
}

}     
      