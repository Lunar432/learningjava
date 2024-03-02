import java.util.Scanner;
public class lab1prob2 {

    public static void main(String[] args){
        //creating object sc of scanner class
       Scanner sc = new Scanner(System.in);
       //taking input for minutes
       System.out.println("Enter number of minutes: ");
       int n = sc.nextInt();
       int year,day;
       //converting to year and day
       year = n/(365*24*60);
       day = (n-(year*365*24*60))/(24*60);
       //printing the result
       System.out.printf("%d minutes is approximately %d years and %d days",n,year,day); 
       sc.close();
    }
    
}
