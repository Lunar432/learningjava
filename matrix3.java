package learningjava;

import java.util.Scanner;

public class matrix3 {
    //sum of each row
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
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println("Sum of row " + i + " is " + sum);
        }
        inp.close();

    }

}
