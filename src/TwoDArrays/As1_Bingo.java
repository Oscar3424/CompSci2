package TwoDArrays;

public class As1_Bingo {
    public static void run() {
        char [] bingoArray = {'b','i','n','g','o'};
        int [][] BingoArray = {
                generateArray(5,1,15),
                generateArray(5,16,30),
                generateArray(5,31,45),
        generateArray(5,46,60),
        generateArray(5,61,75)

        };
        //newArray [0][0] = new int[][]{generateArray(5, 1, 15),generateArray(5,16,30)};
        System.out.println(bingoArray);
        System.out.println(BingoArray);

    }

    public static int [] generateArray(int l, int mi, int ma){
        int [] intArray = new int[l];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Library.myRandom(mi,ma);
        }
     return intArray;
    }




}
