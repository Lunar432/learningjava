import java.util.Scanner;
public class lab1prob3 {
    public static void main(String[] args){
        //creating object sc of scanner class
        Scanner sc = new Scanner(System.in);
        //taking input for a,b,c of equation
        System.out.println("Enter a,b c: ");
        double a = sc.nextDouble();
        double b = sc.nextInt();
        double c = sc.nextInt();
        //discriminant formula
        double disc = (Math.pow(b,2)- 4*a*c);
        
        //condition when discriminant greater than zero
        if(disc>0){
        double root1 = (-b + Math.sqrt(disc))/(2*a);
        double root2 = (-b - Math.sqrt(disc))/(2*a);
        System.out.printf("The equation has two roots %f and %f\n",root1,root2);
        }
        //condition when discriminant equals zero
        else if(disc==0){
        double root = (-b/(2*a));
        System.out.printf("The equation has one root %f\n",root);
        }
        //condition when discriminant less than zero
        else if(disc<0){
        System.out.println("The equation has no real roots\n");
        }
        sc.close();
    }
}