package learningjava;

import java.util.Scanner;

public class lab2prob6 {
    // print student names in decreasing order of their scores
    public static void main(String[] args) {
        // creating object for taking input
        Scanner obj = new Scanner(System.in);
        // taking input of student number
        System.out.println("Enter number of students: ");
        int n = obj.nextInt();
        // declaring array with size
        int[] score = new int[n];
        String[] stdName = new String[n];
        // taking input for every student name and score
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name: ");
            stdName[i] = obj.next();
            System.out.println("Enter student score: ");
            obj.nextLine();
            score[i] = obj.nextInt();
        }
        // sorting student scores in decreasing order
        for (int s = 0; s < n; s++) {
            for (int t = 0; t < n; t++) {
                if (score[s] > score[t]) {
                    // swapping of scores
                    int tempsc = score[s];
                    score[s] = score[t];
                    score[t] = tempsc;
                    //swapping of student names accordingly
                    String tempstd = stdName[s];
                    stdName[s] = stdName[t];
                    stdName[t] = tempstd;
                }
            }
        }
        // printing student name in decreasing order
        System.out.println("Student names in decreasing order of score is:");
        for (int s = 0; s < n; s++) {
            System.out.print(stdName[s]+" has score "+score[s]);
            System.out.println();
        }
        obj.close();
    }

}
