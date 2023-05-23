import java.util.Scanner;;
    public class Transposematrix {
       public static void main(String[] args) {
        int a[][] = new int[2][3];
        
        int i,j;
        Scanner ob = new Scanner(System.in);
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print("Enter a no. : ");
                a[i][j] = ob.nextInt();
            }
        }
        System.out.println("After array...");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
          }
          System.out.println("Before array...");
          for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.print(a[j][i]+"\t");
            }
            System.out.println();
          }
       } 
    }