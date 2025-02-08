package TwoDArrays;

import org.jetbrains.annotations.NotNull;

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
            System.out.print(bingoArray[row] + " ");
            for (int col = 0; col < bingNumArray[row].length; col++) {
                System.out.print(bingNumArray[row][col] + "  ");
            }
            System.out.println();
        }

        boolean bingo = false;

        while(true){
            Library.input.nextLine();
            int ranNum = Library.myRandom(1,75);
//            int ranNum =Library.input.nextInt();
            System.out.println("The number is: " + ranNum);


            boolean found = false;

            for (int row = 0; row<bingNumArray.length;row++) {
                for (int col = 0; col < bingNumArray[row].length; col++) {
                  if(bingNumArray[row][col] == ranNum){
                      bingNumArray[row][col] = -bingNumArray[row][col];
                      found = true;
                  }
                  else if(row == bingNumArray.length - 1 && col == bingNumArray[row].length - 1 && !found){
                      System.out.println("Not found");
                  }
                }
            }//search

            if(found){
                for (int row = 0; row<bingNumArray.length;row++) {
                    System.out.print(bingoArray[row] + " ");
                    for (int col = 0; col < bingNumArray[row].length; col++) {
                        System.out.print(bingNumArray[row][col] + "  ");
                    }
                    System.out.println();
                }
            }//reprint


            for (int row = 0; row<bingNumArray.length;row++) {
                if (checkRow(bingNumArray[row]) || checkColumn(bingNumArray,row)){
                    bingo = true;
                    break;
                }
            }
            if(bingo){
                System.out.println("Bingo!");
                break;
            }

        }//while



    }//run


    public static int [] generateArray(int l, int mi, int ma){
        int [] intArray = new int[l];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Library.myRandom(mi,ma);
        }
     return intArray;
    }//Array generator



    public static boolean checkRow(int[] rows){
        for (int row = 0; row<rows.length;row++) {
            if(rows[row] > 0) {
                return false;
            }
        }
        return true;
    }//row checker

    public static boolean checkColumn(int[][] Array, int columnNum){
        for (int row = 0; row<Array.length;row++) {
            if(Array[row][columnNum] > 0) {
                return false;
            }
        }
        return true;
    }




}
