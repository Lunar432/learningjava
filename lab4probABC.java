package learningjava;

public class lab4probABC {
    public static void main(String[] args) {
        //object declare
        Icecream1 i1 = new Icecream1();
        Icecream1 i2 = new Icecream1();
        //set values
        i1.setComp("Igloo");
        i1.setType("cone");
        i1.setPrice(45);
        i2.setComp("Savoy");
        i2.setType("Cone");
        i2.setPrice(65);
        //get and print values
        System.out.println(i1.getComp());
        System.out.println(i1.getType());
        System.out.println(i1.getPrice());
        System.out.println(i2.getComp());
        System.out.println(i2.getType());
        System.out.println(i2.getPrice());
        //invoke toIceString
        i1.toIceString();
        System.out.println();
        i2.toIceString();
    }

}

class Icecream1 {
    //attributes
    private String icecreamType, icecreamCompany;
    private double icecreamPrice;
    //default constructor
    Icecream1() {
        icecreamPrice = 0;
    }

    /*
     * Icecream1(String comp,String typ, double pr){
     * icecreamCompany = comp;
     * icecreamType = typ;
     * icecreamPrice = pr;
     * }
     */

    //setters
    public void setComp(String comp) {
        icecreamCompany = comp;
    }

    public void setType(String type) {
        icecreamType = type;
    }

    public void setPrice(double price) {
        icecreamPrice = price;
    }
    //getters
    public String getComp() {
        return icecreamCompany;
    }

    public String getType() {
        return icecreamType;
    }

    public double getPrice() {
        return icecreamPrice;
    }
    //displays information
    void toIceString() {
        System.out.println("Icecream company: " + icecreamCompany);
        System.out.println("Icecream type: " + icecreamType);
        System.out.println("Icecream price: " + icecreamPrice);
    }

}