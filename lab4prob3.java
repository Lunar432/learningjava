package learningjava;

public class lab4prob3 {
    public static void main(String[] args) {
        // objects of fraction class
        Fraction fr1 = new Fraction();
        Fraction fr2 = new Fraction();
        // setting values
        fr1.setNumerator(1);
        fr1.setDenominator(4);
        fr2.setNumerator(3);
        fr2.setDenominator(5);
        System.out.println("Fractions: ");
        System.out.println("f1: " + fr1.toString());
        System.out.println("f2: " + fr2.toString());
        // use of addition method
        fr1.add(fr2);
        System.out.println("f1 Addition result: " + fr1.toString());

        // use of subtraction method
        fr1.sub(fr2);
        System.out.println("f1 Subtraction result: " + fr1.toString());

        // use of multiplication method
        fr1.multiplication(fr2);
        System.out.println("f1 Multiplication result: " + fr1.toString());

        // use of division method
        fr1.division(fr2);
        System.out.println("f1 Division result: " + fr1.toString());
    }
}

class Fraction {
    // attributes
    private int numerator, denominator;

    // default constructor
    Fraction() {
    }

    // parameterized constructor
    Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    // setters
    public void setNumerator(int num) {
        numerator = num;
    }

    public void setDenominator(int denom) {
        denominator = denom;
    }

    // getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // turn to string
    public String toString() {
        return " " + numerator + '/' + denominator;
    }

    // add method
    public void add(Fraction fr) {
        numerator = (this.numerator * fr.denominator) + (this.denominator * fr.numerator);
        denominator = (this.denominator * fr.denominator);
        simplify();
    }

    // subtract method
    public void sub(Fraction fr) {
        numerator = (this.numerator * fr.getDenominator()) - (this.denominator * fr.numerator);
        denominator = (this.denominator * fr.denominator);
        simplify();
    }

    // multiply method
    public void multiplication(Fraction fr) {
        numerator = (this.numerator * fr.numerator);
        denominator = (this.denominator * fr.denominator);
        simplify();
    }

    // divide method
    public void division(Fraction fr) {
        numerator = (this.numerator * fr.denominator);
        denominator = (this.denominator * fr.numerator);
        simplify();
    }

    void simplify() {
        int gcd = GCD(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    int GCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return GCD(num2, num1 % num2);
    }
}
