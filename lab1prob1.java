import java.util.Scanner;
public class lab1prob1 {
    public static void main(String[] args){
        //create object check of Scanner class
        Scanner check = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        //take input using check object
        int x = check.nextInt();
        //false for both divisible by both 2 and 3
        if(x%2==0 && x%3==0)
        {
            System.out.println("FALSE");
        } 
        //true for divisible by either 2 or 3
        else if(x%2==0 || x%3==0)
        {
            System.out.println("TRUE");
        }
        //false for every other case
        else
        {
            System.out.println("FALSE");
        }
        
        check.close();
    }

    
}
