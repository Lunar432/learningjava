package learningjava;

import java.util.Scanner;

public class matrix5 {
    //row with largest sum
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        System.out.println("Enter 3X3 array elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = inp.nextInt();
            }
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[] sumRow = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sumRow[i] = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRow[i] += matrix[i][j];
            }
        }
        int sumRowMax = sumRow[0];
        int maxRowInd = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (sumRow[i] > sumRowMax) {
                sumRowMax = sumRow[i];
                maxRowInd = i;
            }
        }
        System.out.println("Row " + maxRowInd + " has largest sum " + sumRowMax);
        inp.close();
    }

}
