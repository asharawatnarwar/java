class Abhi
 {
        public static void main(String[] args) {
            int array [] []= { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    
            int evenCount = 0;
            int oddCount = 0;
    
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) 
                
                { 

                    if (array[i][j] % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
            }

            System.out.println("Even numbers count: " + evenCount);
            System.out.println("Odd numbers count: " + oddCount);
        }
    }