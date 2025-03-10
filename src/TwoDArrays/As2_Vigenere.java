package TwoDArrays;

public class As2_Vigenere {
    public static void run() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[][] vigenere =createVSquare(alphabet);
        printSquare(vigenere);
//        char [] key = {'S','C','O','N','A'};
        char [] key;
        char [] word = {'Y','T','O','Q','U','S','V','S'};
        System.out.println("What key?");
        key = Library.input.nextLine().toCharArray();
        decypher(vigenere,word,key);

    }

    private static char[][] createVSquare(char[] alphabet) {
        char[][] square = new char[alphabet.length][alphabet.length];
        for (int row = 0; row<square.length;row++) {
            for (int col = 0; col<square[row].length; col++){
                square[row][col] = alphabet[(col + row) % alphabet.length];
            }
//            System.out.println();
        }

//code to be written

        return square;

    }//createVSquare

    public static void printSquare(char[][] square) {
        for (int row = 0; row < square.length; row++){
//            System.out.print("  " + square[0][row]);
            for (int col = 0; col<square[row].length; col++){
                System.out.print(square[row][col] + "  ");
            }
            System.out.println();
        }

    }//end printSquare

    public static int linearSearch (char[] arr, char searchTerm){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == searchTerm){
                return i;
            }
        }
        return -1;
    }

    public static void decypher(char [][] arr, char [] coded,char[] key){
        char [] tempArr;
        int foundIndex;
        for (int i = 0; i < key.length; i++) {
            for (int row = 0; row < arr.length; row++){
                if(key[i%key.length] == arr[row][0]) {
                    for (int col = 0; col < arr[row].length; col++) {
                        if (coded[i] == arr[row][col]){
                            System.out.println(arr[col][0]);
                        }

                    }
                }
            }

        }

    }


//    public static char getChar(char [][] arr , int rw, int cl){
//        return arr[rw][cl];
//    }

}
