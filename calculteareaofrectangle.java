
import java.util.Scanner;
class Area{
public static void main (String[] args) 
{
 float a,b;
  Scanner ob = new Scanner(System.in);
  System.out.print("Enter the breath of Rectangle:");
  a=ob.nextFloat();
  System.out.print("Enter the length of Rectangle:");
   b=ob.nextFloat();
   
   float r =area(a,b);
   System.out.println("Area of Rectangle :"+r);
   
   int x,y;
  System.out.print("Enter the breath of Triangle:");
  x=ob.nextInt();
  System.out.print("Enter the length of Triangle:");
   y=ob.nextInt();
   
   float t =area(x,y);
   System.out.println("Area of Rectangle :"+t);
   
   int c;
  System.out.print("Enter the redius of circle :");
  c=ob.nextInt();
  
   
   float z =area(c);
   System.out.println("Area of Rectangle :"+z);
}

static float area(float x,float y)
{
    float result = x*y;
    return result;
}
static float area(int a,int b)
{
    float result = 0.5f*a*b;
    return result;
}
static float area(int r)
{
   final float pi=3.14f;
    float result = pi*r*r;
    return result;
}
}
