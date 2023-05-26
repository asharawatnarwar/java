import java.util.Scanner;
public class twoinputinarray {
    public static void main(String[] args) {
        int a,b;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter 1st no. :");
        a=ob.nextInt();
        System.out.print("Enter 2nd no. :");
        b=ob.nextInt();
        int x[];
        x=fun(a,b);
        for(int i : x){
            System.out.println(i);
        }
    }
    static int[] fun(int a,int b){
        int t[] = {a+b,a-b,a*b,a/b,a%b};
        return t;
    }
    
}
