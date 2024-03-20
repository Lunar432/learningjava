package LAB05;

public class Student {
    private int studentId;
    private String studentName;
    private double studentCgpa;
    private Course[] cList = new Course[7];
    private int numberofcourse;

    Student(){
    }

    Student(int stID,String stNa,double cg){
        studentId = stID;
        studentName = stNa;
        studentCgpa = cg;
    }

    public String getstudentName(){
        return studentName;
    }

    public int getstudentId(){
        return studentId;
    }
    
    public void display(){
        System.out.println("Student ID:"+studentId);
        System.out.println("Student Name:"+studentName);
        System.out.println("STudent CGPA:"+studentCgpa);
    }

    public void addCourse(Course c){
        cList[numberofcourse] = c;
        numberofcourse++;
    }

    public void printCourseList(){
        for(int i=0;i<numberofcourse; i++){
            cList[i].toCString();
            System.out.println();
        }
    }
}
