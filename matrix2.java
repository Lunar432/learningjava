package learningjava;

import java.util.Scanner;

public class matrix2 {
    //print inverted array
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] arr = new int[2][3];
        System.out.println("Enter 2X3 Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = inp.nextInt();
            }
        }
        System.out.println("Original Array:");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[][] invArray = new int[arr[0].length][arr.length];
        System.out.print("Inverted array");
        System.out.println();
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                // System.out.print(arr[i][j]+" ");
                invArray[j][i] = arr[i][j];
                System.out.print(invArray[j][i] + " ");
            }
            System.out.println();
        }
        inp.close();
    }
}
