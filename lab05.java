package LAB05;

public class lab05{
    public static void main(String[] args) {
        //student objects
        Student st1 = new Student(123,"Onima",3.5);
        Student st2 = new Student(232, "Adiba",3.4);
        Student st3 = new Student(145,"Habiba",3.5);
        Student st4 = new Student(468,"Sadia",3.6);
        Student st5 = new Student(232,"Mysha",3.4);
        //course objects
        Course co1 = new Course("CSE110","Java",4.5);
        Course co2 = new Course("Phys109","Engineering Physics 1",4.0);
        Course co3 = new Course("ENG102","Composition",3.0);
        //courses taken by students
        st1.addCourse(co1);
        st1.addCourse(co2);
        System.out.println("Student "+st1.getstudentName()+" takes courses: ");
        st1.printCourseList();
        st2.addCourse(co1);
        st2.addCourse(co2);
        st2.addCourse(co3);
        System.out.println("Student "+st2.getstudentName()+" takes courses: ");
        st2.printCourseList();
        //students added to course 
        co1.addStudent(st1);
        co1.addStudent(st2);
        co1.addStudent(st3);
        co1.addStudent(st4);
        co1.addStudent(st5);
        System.out.println("Course "+co1.getcId()+" has students: ");
        co1.printStudentList();

        
        
        





    }

}