package TwoDArrays;

import java.util.Arrays;

public class As1_Bingo {
    public static void run() {
        char [] bingoArray = {'b','i','n','g','o'};
//        int [][] bingNumArray = new int[5][5];
//        bingNumArray[0] = generateArray(5, 1, 15);
//        bingNumArray[1] = generateArray(5, 16, 30);
        int[][] bingNumArray = new int[][]{
                generateArray(5, 1, 15),
                generateArray(5, 16, 30),
                generateArray(5, 31, 45),
                generateArray(5, 46, 60),
                generateArray(5, 61, 75)

        };


        for (int row = 0; row<bingNumArray.length;row++) {
            for (int col = 0; col < bingNumArray[row].length; col++) {
                System.out.print(bingNumArray[row][col] + "  ");
            }
            System.out.println();
        }

    }

    public static int [] generateArray(int l, int mi, int ma){
        int [] intArray = new int[l];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Library.myRandom(mi,ma);
        }
     return intArray;
    }




}
