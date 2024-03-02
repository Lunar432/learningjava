package learningjava;

import java.util.Scanner;

public class lab2prob4 {
    // check and input for ten distinct numbers
    public static void main(String[] args) {
        // create object for taking input
        Scanner sc = new Scanner(System.in);
        // initialise array and count
        int[] num = new int[10];
        int count = 0;
        // take input for ten numbers
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < num.length; i++) {
            int x = sc.nextInt();
            // checks if number is distinct and stores in the array
            if (Isdistinct(num, x, count)) {
                num[count] = x;
                count++; // count increment
            }
        }
        // print the array of distinct numbers
        System.out.println("Array of distinct numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.println(num[i]);
        }
        sc.close();

    }

    // method to check if newly input number is distinct
    public static boolean Isdistinct(int[] n, int digit, int count) {
        // loop runs until current value of input
        for (int i = 0; i < count; i++) {
            if (n[i] == digit) {
                // not distinct if number matches
                return false;
            }
        }
        // distinct otherwise
        return true;

    }
}
