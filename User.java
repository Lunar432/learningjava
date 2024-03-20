package learningjava;

public class User {
    private int userId;
    private String userName;
    private Vehicle[] vList = new Vehicle[5];
    private int numberofvehicle = 0;
    User(){
    }
    
    User(int uID, String uName){
        userId = uID;
        userName = uName;
    }

    public int getUserId(){
        return userId;
    }

    public String getUserName(){
        return userName;
    }

    public void addVehicle(Vehicle v){
        vList[numberofvehicle] = v;
        numberofvehicle++;
    }

    public Vehicle searchVehicle(int vId){
        for(int i=0; i<vList.length;i++){
            if(vList[i].getVehicleID()== vId){
                return vList[i];
            }
        }
        return null;
    }

    public void display(){
        System.out.println("User ID: "+userId);
        System.out.println("User Name:"+userName);

    }
    public void printVehicleList(){
        for(int i=0; i<numberofvehicle;i++){
            vList[i].display();
            System.out.println();
        }
    }
}
