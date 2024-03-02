package learningjava;

import java.util.Scanner;

public class HA2_prob1 {
    //Summation of all elements in a 2D array
    public static void main(String[] args) {
        //create object for taking input
        Scanner obj = new Scanner(System.in);
        //take input for 2D arrays
        System.out.println("Enter number of rows: ");
        int m = obj.nextInt();
        System.out.println("Enter number of columns: ");
        int n = obj.nextInt();
        //initialize 2D array
        int[][] array = new int[m][n];
        System.out.println("Enter 2D array elements: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = obj.nextInt();
            }
        }
        //initialize sum with zero
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //add every element of array in loop
                sum += array[i][j];
            }
        }
        //print total sum
        System.out.println("Sum of all elements in 2D array is: " + sum);
        obj.close();
    }

}
