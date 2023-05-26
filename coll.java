 class Solve
{
    static float tmp(float...x)
    {
        float sum=0;
      for(float i :x){
         sum+=i;
      
      }
      return sum;
    }
     public static void main(String[] args) {
      
      float x =  tmp(3.4f,5.6f);
      float y = tmp(3.4f,4.6f);

      System.out.println(x+y);

    }
}