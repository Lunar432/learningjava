package learningjava;

import java.util.Scanner;

public class lab2prob3 {
    // display if number is palindrome or not
    public static void main(String[] args) {
        // create object for taking input
        Scanner obj = new Scanner(System.in);
        // take a number input
        System.out.println("Enter a number: ");
        String num = obj.next();
        // initialise palindrome and left and right index
        int left = 0;
        int right = num.length() - 1;
        boolean palindrome = false;
        // loop runs until right index is greater than left
        while (left < right) {
            // checks if numbers are equal on both sides
            if (num.charAt(left) == num.charAt(right)) {
                // update boolean value to true
                palindrome = true;
            } else {
                // update boolean value and break the loop if false
                palindrome = false;
                break;
            }
            // index for left increments and index for right decreases
            left++;
            right--;
        }
        // print if number is palindrome or not
        if (palindrome) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
        obj.close();
    }
}
