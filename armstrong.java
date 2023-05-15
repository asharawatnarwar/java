import java.util.Scanner;
class Demo
{
    public static void main(String arr[])
    {
       int number , originalNumber, remainder, result = 0, n = 0;
           Scanner ob = new Scanner(System.in);

           System.out.print("Enter a no.:");
           number = ob.nextInt();
           
          originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

}
