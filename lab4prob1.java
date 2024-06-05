package learningjava;

import java.util.Scanner;

public class lab4prob1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // array of objects
        Icecream3[] ice = new Icecream3[5];
        // take input for array of objects
        for (int i = 0; i < ice.length; i++) {
            ice[i] = new Icecream3();
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
        // searching by the input of company name
        System.out.println("Enter icecream company name to search by: ");
        String company = inp.next();
        // store returned object in matchedIcecream
        Icecream3 matchedIcecream = searchByCompany(ice, company);
        // checks for null return value
        if (matchedIcecream != null) {
            matchedIcecream.display();
        } else {
            System.out.println("No icecream found for the company" + company);
        }
        inp.close();
    }

    public static Icecream3 searchByCompany(Icecream3[] ice, String comp) {
        for (int i = 0; i < ice.length; i++) {
            // checks for same company name in all objects
            if (ice[i].getComp().compareTo(comp) == 0) {
                return ice[i];
            }
        }
        //returns null if condition is not met 
        return null;
    }

}

class Icecream3 {
    // attributes
    private String icecreamType, icecreamCompany;
    private double icecreamPrice;

    // default costructor
    Icecream3() {
        icecreamPrice = 0;
    }

    // parameterized constructor
    Icecream3(String comp, String typ, double pr) {
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
    // displays all information
    public void display() {
        System.out.println("Icecream company: " + icecreamCompany);
        System.out.println("Icecream type: " + icecreamType);
        System.out.println("Icecream price: " + icecreamPrice);
    }

}
