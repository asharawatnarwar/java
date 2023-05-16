class Alph {
    public static void main(String arr[]) {
        char i = 'A';
        for (int j = 1; j <= 5; j++) {
            
            for (int k = 1; k <= j; k++) {
                System.out.print(i);
                

            }
            i++;
            System.out.println();
        }

        for (int j = 4; j >= 1; j--) {
            
            for (int k = 1; k <=j; k++) {
                System.out.print(i);
                

            }
            i--;
            System.out.println();
        }
    }
}