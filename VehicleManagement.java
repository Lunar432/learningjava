package learningjava;

import java.util.Scanner;

public class VehicleManagement {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Vehicle[] v = new Vehicle[4];
        User[] u = new User[2];
        v[0] = new Vehicle(189, "Truck", 1500);
        v[1] = new Vehicle(567, "SUV", 3000);
        v[2] = new Vehicle(248, "Sedan", 3000);
        v[3] = new Vehicle(378, "Bus", 4000);
        u[0] = new User(01, "A");
        u[1] = new User(02, "B");
        if (v[1].compareTo(v[2])) {
            System.out.println(v[1].getVehicleType() + " has same rent as " + v[2].getVehicleType());
        } else {
            System.out.println(v[1].getVehicleType() + " not same rent as " + v[2].getVehicleType());
        }
        // users taking vehicles by add implementation
        for (int i = 0; i < 2; i++) {
            u[0].addVehicle(v[i]);
        }
        for (int i = 2; i < 4; i++) {
            u[1].addVehicle(v[i]);
        }
        // search implementation
        System.out.println("Enter vehicle ID to search for " + u[0].getUserName() + ":");
        int vId0 = inp.nextInt();
        if (u[0].searchVehicle(vId0)!=null){
        Vehicle matchedVehicle = searchVehicle(vId0);
        matchedVehicle.display();
        }
        System.out.println("Enter vehicle ID to search for " + u[1].getUserName() + ":");
        int vId1 = inp.nextInt();
        if (u[1].searchVehicle(vId0)!= null) {
        Vehicle matchedVehicle = searchVehicle(vId1);
        matchedVehicle.display();
        }
        //print list of vehicles of each user
        System.out.println("List of vehicles of "+u[0].getUserName());
        u[0].printVehicleList();
        System.out.println("List of vehicles of "+u[1].getUserName());
        u[1].printVehicleList();
        inp.close();
    }

}
