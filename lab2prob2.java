package learningjava;

import java.util.Scanner;

public class lab2prob2 {
    // read integers between 1 and 100 and count occurrence of each
    public static void main(String[] args) {
        // create object for taking input
        Scanner obj = new Scanner(System.in);
        // declare array
        int[] count = new int[101];
        System.out.println("Eter the integers between 1 and 100: ");
        // infinite loop
        while (true) {
            int x = obj.nextInt();
            // terminates when 0 is entered
            if (x == 0)
                break;
            // count increments when value is between 1 and 100
            else if (x >= 1 && x <= 100) {
                count[x]++;
            }
        }
        // print the number of occurrences
        for (int i = 1; i < count.length; i++) {
            // prints only if number occurs at least once
            if (count[i] > 0) {
                System.out.println(i + " occurs " + count[i] + " times ");
            }
        }
        obj.close();
    }
}