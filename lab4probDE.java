package learningjava;

import java.util.Scanner;

public class lab4probDE {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // icecream object array declare
        Icecream2[] ice = new Icecream2[5];
        //take input for array by loop
        for (int i = 0; i < ice.length; i++) {
            ice[i] = new Icecream2();
            System.out.println("Enter icecream company: ");
            String comp = inp.next();
            System.out.println("Enter icecream type: ");
            String type = inp.next();
            System.out.println("Enter icecream price: ");
            double price = inp.nextDouble();
            ice[i].setComp(comp);
            ice[i].setType(type);
            ice[i].setPrice(price);
        }
        // use of equals method

        if (ice[0].equalsIce(ice[1])) {
            System.out.println(ice[0].getComp() + " and " + ice[1].getComp() + " icecream price is equal");
        } else {
            System.out.println(ice[0].getComp() + " and " + ice[1].getComp() + " icecream price is not equal");
        }

        // use of compareTo method

        if (ice[0].compareToIce(ice[1]) > 0) {
            System.out.println(ice[0].getComp() + " price is greater than " + ice[1].getComp() + " price");
        } else if (ice[0].compareToIce(ice[1]) == 0) {
            System.out.println(ice[0].getComp() + " and " + ice[1].getComp() + " price is same");
        } else if (ice[0].compareToIce(ice[1]) < 0) {
            System.out.println(ice[0].getComp() + " price is less than " + ice[1].getComp() + " price");

            inp.close();
        }
    }
}

class Icecream2 {
    // attributes
    private String icecreamType, icecreamCompany;
    private double icecreamPrice;

    // default costructor
    Icecream2() {
        icecreamPrice = 0;
    }

    // parameterized constructor
    Icecream2(String comp, String typ, double pr) {
        icecreamCompany = comp;
        icecreamType = typ;
        icecreamPrice = pr;
    }

    // setters
    public void setComp(String comp) {
        icecreamCompany = comp;
    }

    public void setType(String type) {
        icecreamType = type;
    }

    public void setPrice(double price) {
        icecreamPrice = price;
    }

    // getters
    public String getComp() {
        return icecreamCompany;
    }

    public String getType() {
        return icecreamType;
    }

    public double getPrice() {
        return icecreamPrice;
    }

    // equals method define
    public boolean equalsIce(Icecream2 ic) {
        if (icecreamPrice == ic.getPrice())
            return true;
        else
            return false;
    }

    // compareTo method define
    public int compareToIce(Icecream2 ic) {
        if (icecreamPrice == ic.getPrice()) {
            return 0;
        } else if (icecreamPrice > ic.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
