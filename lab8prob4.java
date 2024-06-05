package learningjava;

import java.util.*;

class GeometricObject {

    String color;
    boolean filled;

    GeometricObject() {
        color = "White";
        filled = false;
    }

    GeometricObject(String c, boolean f) {
        this.color = c;
        this.filled = f;
    }

    public String toString() {
        return "Colour: " + color + " Filled: " + filled;
    }

}

class IllegalTriangleException extends Exception {
    IllegalTriangleException(String str) {
        super(str);
    }
}

class Triangle1 extends GeometricObject {
    private double side1, side2, side3;

    Triangle1() {
        super();
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    Triangle1(double s1, double s2, double s3) throws IllegalTriangleException {
        super();
        if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2) {
            IllegalTriangleException i = new IllegalTriangleException("Invalid Triangle Sides");
            throw i;
        }
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = ((side1 + side2 + side3) / 2);
        return (Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    public String toString() {
        super.toString();
        return "Side 1: " + side1 + " Side 2: " + side2 + " Side 3: " + side3 + "\n" + super.toString();
    }
}

public class lab8prob4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.println("Enter Three Sides: ");
            double s1 = inp.nextDouble();
            double s2 = inp.nextDouble();
            double s3 = inp.nextDouble();
            Triangle1 t = new Triangle1(s1, s2, s3);
            System.out.println("Area: " + t.getArea());
            System.out.println("Perimeter: " + t.getPerimeter());
            System.out.println(t.toString());
        } catch (IllegalTriangleException t) {
            System.out.println("Error: " + t.getMessage());
        } finally {
            inp.close();
        }
    }
}
