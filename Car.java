package learningjava;

public abstract class Car {
    String company, model;
    int count, year;

    public Car(){}

    public Car(String c,String m,int co,int y){
        this.company = c;
        this.model = m;
        this.count = co;
        this.year = y;
    }

    public abstract void fuelEfficiency();

    public  String display(){
        return "\n\nCompany: "+company+"\nModel: "+model+"\nCount: "+count+"\nYear Created: "+year;
    }
}
