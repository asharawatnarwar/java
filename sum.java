
public class sum
{
    static float tmp(float ...x)
    {
        float sum=0;
      for(float i :x){
         sum=sum+i;
      
      }
    
      System.out.println(sum);
    }
     public static void main(String[] args) {
      
       tmp(3.4f,5.6f);
      tmp(3.4f,4.6f);

    }
}