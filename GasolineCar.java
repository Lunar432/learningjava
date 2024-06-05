package learningjava;

import java.io.*;

public class GasolineCar extends Car implements Serializable{
    double batteryCapacity, milesPerGallon;

    public GasolineCar(String c,String m,int co,int y,double bCapacity,double mPerGallon){
        super(c,m,co,y);
        this.batteryCapacity = bCapacity;
        this.milesPerGallon = mPerGallon;
    }

    public void fuelEfficiency(){
        System.out.println("Fuel Efficiency: "+(batteryCapacity/milesPerGallon));
    }

    public String display(){
        return super.display()+
        "\nBattery Capacity: "+batteryCapacity+"\nMiles per Gallon: "+milesPerGallon;
    }
}
