package learningjava;

import java.io.*;
import java.util.*;

public class CartxtFile {
    public static void main(String[] args) {
        File file = new File("Car.txt");
        Car[] cars = new Car[2];
        cars[0] = new ElectricCar("Tesla","VS5",1,2002,200,50);
        cars[1] = new GasolineCar("Volvo", "TS67", 2, 2013, 500, 40);
        try(  PrintWriter write = new PrintWriter(file);
              Scanner read = new Scanner(file);
              ){
        if(!file.exists()){
            if(file.createNewFile()){
                System.out.println("File created successfully");
            } else{
                System.out.println("File not created");
                IOException c = new IOException("IO Error occured");
                throw c;
            }
        }
        for(Car c:cars){
            write.print(c.display());
        }
        write.close();
        while(read.hasNext()){
            String line = read.nextLine();
            System.out.println(line);
        }
        read.close();

    } catch(IOException e){
        System.out.println("Error: "+e.getMessage());
    } 
    }
    
}
