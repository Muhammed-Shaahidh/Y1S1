/*
Develop a system to manage student information and university details.

 (a) Create a Student class with attributes studentId, studentName.

 (b) Include a static variable universityName to be shared among all students.

 (c) Add constructors and a method displayStudentInfo() that includes univer
sity name.

 (d) In the main method:
         A. Set universityName using the class name.
         B. Create a three Student objects and display their details.
         C. Change the university name mid-way and show its impact on all
            objects by calling the displayStudentInfo() again .
 */

package Q3;

class Student{
    public int  studentId;
    public String studentName;
    public static String universityName;

    public Student(int studentId,String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }

    public void displayStudentInfo(){
        System.out.println("\nStudent ID: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("University Name: "+universityName);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        Student.universityName="SLIIT";

        Student s1=new Student(001,"Dilum");
        s1.displayStudentInfo();

        Student s2=new Student(002,"Senal");
        s2.displayStudentInfo();

        Student s3=new Student(003,"Kasun");
        s3.displayStudentInfo();

        Student.universityName="SLIIT KANDY UNI";

        System.out.println("\nAfter change the university name mid-way:");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
    }
}
