package learningjava;
import java.util.*;

class InvalidIdException extends Exception{
    InvalidIdException(String str){
        super(str);
    }
}

class student1{
  private String Id;
  private String name;
  public student1(){

  }

  public student1(String n,String id) throws InvalidIdException{
    validateId(id);
    this.Id = id;
    this.name = n;
  }

  public void setId(String i) throws InvalidIdException{
    validateId(i);
    this.Id = i;
  }
  public void setName(String n){
    this.name = n;
  }

  public String getName(){
    return name;
  }

  public String getId(){
    return Id;
  }

  public void validateId(String i) throws InvalidIdException{
    String idPattern = "\\d{4}"+"-"+"\\d{1}"+"-"+"\\d{2}"+"-"+"\\d{3}";
    if(!i.matches(idPattern)){
        InvalidIdException e = new InvalidIdException("Invalid Id Pattern: "+i);
        throw e;
    }
  }

}

public class StudentId {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try{
            System.out.println("Enter Student Name: ");
            String n = inp.nextLine();
            System.out.println("Enter Student Id: ");
            String id = inp.next();
            student1 s = new student1(n,id);
            System.out.println("Student "+s.getId()+" created successfully.");

        } catch(InvalidIdException e){
            System.out.println("Error: "+e.getMessage());
        } finally{
            inp.close();
        }
    }
}
