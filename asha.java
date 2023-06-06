import java.util.Scanner;
 class Main
{
	public static void main(String[] args) 
	{
	    int num,i;
	    Scanner ob = new Scanner(System.in);
	    System.out.print("Enter the number of table:");
	    num = ob.nextInt();
	    
	    for(i=1;i<=10;i++);
	    {
            System.out.println(+num  "*"  +i+ "="  +num  *  i);
	    }
	}
}
