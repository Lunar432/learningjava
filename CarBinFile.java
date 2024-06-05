package learningjava;

import java.io.*;


public class CarBinFile {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new ElectricCar("Tesla","VSK5",1,2002,200,50);
        cars[1] = new GasolineCar("Volvo", "TS67", 2, 2013, 500, 40);
        File file = new File("Car.dat");
        try(
        ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream(file));){
            for(Car c:cars){
                w.writeObject(c);
            }
            System.out.println("Car Info written to Car.dat");
        } catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        } catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
        try( ObjectInputStream r = new ObjectInputStream( new FileInputStream(file))){
            while(true){
                try{
                    Car car = (Car) r.readObject();
                    System.out.println(car.display());     
                } catch(EOFException e){

                    break;
                }
            }
        } catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch(IOException c){
            System.out.println(c.getMessage());
        } 

    }
    
}
