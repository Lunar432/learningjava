package learningjava;

import java.util.Scanner;

public class palindrome {
    //checking palindrome with int
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number: ");
        String strNum = inp.next();
        int intNum = Integer.parseInt(strNum);
        int revNum = 0;
        int num = intNum;
        while (num != 0) {
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;
        }
        System.out.println(revNum);
        if (revNum ==intNum) {
            System.out.println("The number is a palindrome");
        } 
        else if(revNum!=num) {
            System.out.println("The number is not a palindrome");
        }
        inp.close();

    }

}
