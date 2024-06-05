package learningjava;
import java.util.*;
import java.io.*;

public class StudentBinFile {

    public static int MaxAge(student2[] st){
        int maxAge = st[0].age;
        for(int i=0;i<3;i++){
            if(st[i].age > maxAge){
                maxAge = st[i].age;
            }
        }
        return maxAge;
    }
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    File file = new File("StudentInfo.dat");
    student2[] st = new student2[3];
    try(
        ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream(file));){
            for(int i=0;i<3;i++){
                inp.nextLine();
                System.out.println("Enter Student information:");
                System.out.println("Name: ");
                String n =  inp.nextLine();
                System.out.println("Age: ");
                int age = inp.nextInt();
                System.out.println("ID: ");
                int id =  inp.nextInt();
                System.out.println("CGPA: ");
                double cg =  inp.nextDouble();
                st[i] = new student2(n,id,age,cg);
            }
            System.out.println("Max Age: "+ MaxAge(st));

            for(student2 s:st){
                w.writeObject(s);
            }
            w.close();
            System.out.println("Student info written to studentInfo.dat successfully");
            
        } catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        } catch(IOException f){
            System.out.println("Error: "+f.getMessage());
        }

        try( ObjectInputStream r = new ObjectInputStream(new FileInputStream(file));){
            
            while(r.available()!=0){
                try{
                student2 s = (student2) r.readObject(); 
                System.out.println(s.toString());
                } catch(EOFException e){
                    break;
                }
                
            }
            System.out.println("Displayed from studentInfo.dat");
            
        } catch(ClassNotFoundException e){
            System.out.println("Error"+e.getMessage());
        } catch(FileNotFoundException e){
            System.out.println("Error"+e.getMessage());
        } catch(IOException f){
            System.out.println("Error"+f.getMessage());
        }

        inp.close();

 }
}