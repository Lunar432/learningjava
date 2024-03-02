import java.util.Scanner;
public class lab1prob5 {
    public static void main(String[] args){
        //creating object input of scanner class
        Scanner input = new Scanner(System.in);
        //take input for radius and point
        System.out.println("Enter radius r:");
        int r = input.nextInt();
        System.out.println("Enter a point (x,y):");
        int x = input.nextInt();
        int y = input.nextInt();
        //formula for position of point about the circle
        double circ = (Math.pow((x),2)+ Math.pow((y),2));
        double pos = Math.sqrt(circ);
        //condition for value smaller than radius
        if(pos<r){
            System.out.println("Point is within the circle");
        }
        //condition for value equal to radius
        else if(pos==r){
            System.out.println("Point is on the circle");
        }
        //condition for value greater than radius
        else if(pos>r){
            System.out.println("Point is outside the circle");
        }
        input.close();
    }
}
