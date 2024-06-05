package learningjava;

import java.io.*;

public class ElectricCar extends Car implements Serializable{
    double batteryCapacity, chargingCost;

    public ElectricCar(){}

    public ElectricCar(String c,String m,int co,int y,double bCapacity,double chCost){
        super(c,m,co,y);
        this.batteryCapacity = bCapacity;
        this.chargingCost = chCost;
    }


    public void fuelEfficiency(){
        double fuelEfficiency =batteryCapacity/chargingCost;
        System.out.println("Fuel Efficiency: "+fuelEfficiency);
    }

    public String display(){
        return super.display()+
        "\nBattery Capacity: "+batteryCapacity+"\nCharging Cost: "+chargingCost;

    }


}
