package learningjava;

import java.util.Scanner;

public class lab2prob5 {
    // find highest and smallest element and their index from random array
    public static void main(String[] args) {
        // create object for taking input
        Scanner sc = new Scanner(System.in);
        // declare array
        int[] numbers = new int[100];
        // generate random values for elements of array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 51);
            System.out.println(numbers[i] + " ");
        }
        // call methods and store their result in arrays
        int[] highestRes = Highest(numbers);
        int[] lowestRes = Lowest(numbers);
        // print the result
        System.out.println("Highest Number is: " + highestRes[0] + " at " + highestRes[1] + " index");
        System.out.println("Lowest Number is: " + lowestRes[0] + " at " + lowestRes[1] + " index");
        sc.close();
    }

    // function for finding highest result
    public static int[] Highest(int[] n) {
        int max = n[0];
        int maxIndex = 0;
        // find max number and its index
        for (int s = 0; s < n.length; s++) {
            if (n[s] > max) {
                max = n[s];
                maxIndex = s;
            }
        }
        // array with max and index is returned when called
        return new int[] { max, maxIndex };
    }

    // function for finding lowest result
    public static int[] Lowest(int[] n) {
        int min = n[0];
        int minIndex = 0;
        // find min number and its index
        for (int k = 0; k < n.length; k++) {
            if (n[k] < min) {
                min = n[k];
                minIndex = k;
            }
        }
        // array with min and index is returned when called
        return new int[] { min, minIndex };
    }

}
