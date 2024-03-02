package learningjava;

import java.util.Scanner;

public class lab3prob2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter password: ");
        String pass = inp.nextLine();
        int count = 0;
        boolean passValid = true;
        if (pass.length() < 8) {
            System.out.println("Invalid Password!! Needs at least 8 characters!");
            passValid = false;
        }
        for (int i = 0; i < pass.length(); i++) {
            if (!((pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')
                    || (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z')
                    || (pass.charAt(i) >= '0' && pass.charAt(i) <= '9'))) {
                System.out.println("Invalid Password!! Needs to be letter or digits!");
                passValid = false;
                break;
            }
            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                count++;
            }
        }
        if (passValid) {
            if (count >= 2) {
                System.out.println("Valid Password!! Saved!");
            } else {
                System.out.println("Invalid Password!! Needs at least 2 digits!");
            }
        }
        inp.close();
    }

}
