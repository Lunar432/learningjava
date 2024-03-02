package learningjava;

import java.util.Scanner;

public class lab2prob1 {
    // read best score and assign grades
    public static void main(String[] args) {
        // create object for taking input
        Scanner obj = new Scanner(System.in);
        // take input for number and grades
        System.out.println("Enter the number of students: ");
        int n = obj.nextInt();
        int[] score = new int[n];
        System.out.print("Enter " + n + " scores:");
        for (int i = 0; i < n; i++) {
            score[i] = obj.nextInt();
        }
        // check for best score
        int best = score[0];
        for (int i = 0; i < n; i++) {
            if (score[i] > best) {
                best = score[i];
            }
        }
        // print the grades accordingly
        for (int i = 0; i < n; i++) {
            if (score[i] >= (best - 10)) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is A");
            } else if (score[i] >= (best - 20)) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is B");
            } else if (score[i] >= (best - 30)) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is C");
            } else if (score[i] >= (best - 40)) {
                System.out.println("Student " + i + " score is " + score[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is" + score[i] + " and grade is F");
            }
        }
        obj.close();
    }
}
