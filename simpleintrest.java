import java.util.*;
class Demo 
{
  public static void main(String arr[])
  {
    float p,r,t,si;
     Scanner ob = new Scanner (System.in);
      
     System.out.println("Enter principle");
     p=ob.nextFloat();
     System.out.println("Enter Rate");
     r=ob.nextFloat();
     System.out.println("Enter Time");
     t=ob.nextFloat();

   si=p*r*t/100;
    System.out.println("Simple intrest=" +si);
}

}     
      