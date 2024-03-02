package learningjava;

import java.util.Scanner;

public class lab3prob4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number of strings: ");
        int n = inp.nextInt();
        String[] lexico = new String[n];
        System.out.println("Enter " + n + " words: ");
        inp.nextLine();
        for (int i = 0; i < lexico.length; i++) {
            lexico[i] = inp.nextLine();
        }
        for (int i = 0; i < (lexico.length - 1); i++) {
            for (int j = 0; j < (lexico.length - i - 1); j++) {
                if ((lexico[j].compareTo(lexico[j + 1])) > 0) {
                    // swapping
                    String tempLex = lexico[j];
                    lexico[j] = lexico[j + 1];
                    lexico[j + 1] = tempLex;
                }
            }
        }
        System.out.println();
        System.out.println("In the lexicographical order: ");
        for (int i = 0; i < lexico.length; i++) {
            System.out.println(lexico[i]);
        }
        inp.close();
    }

}
