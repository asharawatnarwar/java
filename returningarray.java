import java.util.*;
public class returningarray {
    public static void main(String[] args) {
        int ar[] , size;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        size = ob.nextInt();

        ar = new int[size];

        for (int i = 0; i<ar.length; i++) {
            System.out.print("ENter A Numbere : ");
            ar[i] = ob.nextInt();
            
        }

        int arrg[];

        arrg =  Arraycopy(ar);

        for (int i = arrg.length -1; i>=0; i--) {
            System.out.println(arrg[i]);
        }
    }

    static int[]  Arraycopy(int arg[]){
        int temp[] = new int[arg.length];
        System.out.println("You Entered : ");
        for (int i : arg) {
            System.out.println(i);
        }

        for(int i = arg.length - 1; i >= 0; i--){
            temp = arg;
        }
        
        return temp;


    }
}

}
