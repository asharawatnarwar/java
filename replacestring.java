import java.util.Scanner;

class Str{
    public static void main(String arg[])
    {
    int size;

    String find , replace;
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter the size of array:");
    size = ob.nextInt();

    String ar[] = new String[size];

    for(int i = 0; i<ar.length; i++){
        System.out.print("Enter A String : ");
        ar[i] = ob.next();
    }
     System.out.println("Your Entered Strings Are : ");
    for(int i = 0; i<ar.length; i++){
        System.out.print(ar[i]);
    }

    System.out.print("Eneter String That You Want To Find : ");
    find = ob.next();
    System.out.print("Enter The String That You Want To Replace : ");
    replace = ob.next();
    for(int i = 0; i<ar.length; i++){
        if(ar[i].equals(find)){
            ar[i] = replace;
        }
    }
 
    for(int i = 0; i<ar.length; i++){
        System.out.println("After The Replace Your Strings Are : "+ar[i]);
    }
    }
}