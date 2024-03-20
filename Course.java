package LAB05;

public class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private Student[] studentList = new Student[50];
    private int numberofstudents = 0;

    Course(){
    }

    Course(String cId,String cTitle, double cr){
        courseId = cId;
        courseTitle = cTitle;
        credit = cr;
    }

    public String getcId(){
        return courseId;
    }

    public String getcTitle(){
        return courseTitle;
    }

    public void toCString(){
        System.out.println("Course ID:"+ courseId);
        System.out.println("Course Title:"+ courseTitle);
        System.out.println("Course credit:"+ credit);
    }

    public void addStudent(Student s){
        studentList[numberofstudents] = s;
        numberofstudents++;
    }
    
    public void printStudentList(){
        for(int i=0;i<numberofstudents;i++){
            studentList[i].display();
            System.out.println();
        }
    }
    
}
