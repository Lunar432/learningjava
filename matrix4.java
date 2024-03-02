package learningjava;

import java.util.Scanner;

public class matrix4 {
    //sum of each column
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] array = new int[3][3];
        System.out.println("Enter 3X3 Array elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = inp.nextInt();
            }
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < array[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            System.out.println("Sum of column " + j + " is " + sum);
        }
        inp.close();
    }

}
