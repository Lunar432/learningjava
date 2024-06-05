package learningjava;

import java.util.*;
import java.io.*;


class student2 implements Serializable{
    String name;
    int id;
    double cgpa;
    int age;

    student2(){

    }

    student2(String n,int i,int ag, double c){
        this.name = n;
        this.id = i;
        this.age = ag;
        this.cgpa = c;
    }


    public String toString(){
        return "Name: "+name+"\nAge: "+age+" \nID: "+id+"\n CGPA: "+cgpa;
    }


}

public class StudentFile {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        File file = new File("StudentInfo.txt");
        try( PrintWriter w = new PrintWriter(file);){
            
            // Check if file exists, if not, create it
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("File created successfully: "+file.getAbsolutePath() );
                } else {
                    System.out.println("Failed to create file: "+file.getAbsolutePath() );
                    return;
                }
            } else {
                System.out.println("File already exists: " + file.getAbsolutePath());
            }
            // Initialize PrintWriter to write to the file
            student2[] s = new student2[3];

            // Get student information from the user
            for (int i = 0; i < 3; i++) {
                inp.nextLine();  // Consume the leftover newline character
                System.out.println("Enter Student Information: ");
                System.out.print("\nName: ");
                String name = inp.nextLine();
                System.out.print("\nID: ");
                int id = inp.nextInt();
                System.out.println("\nAge: ");
                int age = inp.nextInt();
                System.out.print("\nCGPA: ");
                double cgpa = inp.nextDouble();
                System.out.print("\n");
                s[i] = new student2(name, id,age, cgpa);
            }

            // Write student information to the file
            for (student2 st : s) {
                w.print(st.toString());
            }
            Scanner inp1 = new Scanner(file);
            while(inp1.hasNext()){
               
                System.out.println(inp1.nextLine());
                
            }
        
            // Close the PrintWriter and scanner
           
            inp1.close();
        

            System.out.println("Student information saved successfully.");
        } catch (FileNotFoundException fn) {
            System.out.println("Error: File not found. " + fn.getMessage());
        } catch (InputMismatchException e) {

            System.out.println("Error: An I/O error occurred. " + e.getMessage());
        }  catch (IOException e) {
            System.out.println("Error: An I/O error occurred. " + e.getMessage());
        } finally {
            inp.close();
        }
    }
}
