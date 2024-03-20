package learningjava;

public class Vehicle {
    private int vehicleId;
    private String vehicleType;
    private double vehicleRent;
    private User[] userList = new User[5];
    private int userNumber = 0;
    private static int vCount = 0;

    Vehicle(){
    }
    
    Vehicle(int vId,String vType,double vRent){
        vehicleId = vId;
        vehicleType = vType;
        vehicleRent = vRent;
        vCount++;
    }

    public int getVehicleID(){
        return vehicleId;
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public double getVehicleRent(){
        return vehicleRent;
    }

    public int getvCount(){
        return vCount;
    }

    public boolean compareTo(Vehicle v){
        if(this.getVehicleRent()== v.getVehicleRent()){
            return true;
        }
        else{
        return false;
        }
    }

    public void addUser(User u){
        userList[userNumber] = u;
        userNumber++;
    }

    public User searchUser(int uId){
        for(int i=0;i<userList.length;i++){
        if(userList[i].getUserId()== uId){
           return userList[i];
        }
        }
        return null;
    }

    public void display(){
        System.out.println("Vehicle ID:"+vehicleId);
        System.out.println("Vehicle Type:"+vehicleType);
        System.out.println("Vehicle Count:"+vCount);
        System.out.println("Vehicle Rent:"+vehicleRent);
    }

    public void printUserList(){
        for(int i=0; i<userNumber;i++){
            userList[i].display();
            System.out.println();
        }
    }
}
