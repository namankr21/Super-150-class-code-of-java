package lec15;

public class WavePrintSnakePattern2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 01, 02, 03, 04 }, 
                        { 05, 06, 07, 8 }, 
                        { 9, 10, 11, 12 }, 
                        { 13, 14, 15, 16 }, 
                        { 17, 18, 19, 20 } };
        System.out.print("Snake-Wave Form : ");
        ColWavePrint(arr);
    }

    public static void ColWavePrint(int[][] arr) {
        for (int cols = 0; cols < arr[0].length; cols++) {
            if (cols % 2 == 0) {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][cols] + " ");
                }
            } else {
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][cols] + " ");
                }
            }
        }

    }

}
