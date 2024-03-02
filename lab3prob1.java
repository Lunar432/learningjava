package learningjava;

import java.lang.Math;

public class lab3prob1 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        int[] countRow = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    countRow[i]++;
                }
            }
        }
        int[] countCol = new int[4];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (matrix[i][j] == 1) {
                    countCol[j]++;
                }
            }
        }
        int maxCountRow = countRow[0];
        int maxRowInd = 0;
        int maxCountCol = countCol[0];
        int maxColInd = 0;
        for (int i = 0; i < 4; i++) {
            if (countRow[i] > maxCountRow) {
                maxCountRow = countRow[i];
                maxRowInd = i;
            }
            if (countCol[i] > maxCountCol) {
                maxCountCol = countCol[i];
                maxColInd = i;
            }
        }
        System.out.println("The largest row index: " + maxRowInd);
        System.out.println("The largest column index is: " + maxColInd);
    }

}
