package org.example.bad.S;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String course;
    private int age;
    private String emailId;
    private String uniqueID;
    private String address;

    static ArrayList<Student> studentsList = new ArrayList<Student>();

    public String getCourse() {
        return course;
    }

    public String getLastName() {
        return lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public static void main(String[] args){
        addStudent();
        displayStudents();
        getStudentById("B00928374");
        updateStudent("B00928374", new Student("James",
                        "Kim",
                        928472633,
                        "MACS",
                        25,
                        "john@gmail.com",
                        "B00928374",
                        "Halifax"));
        deleteStudent("B00928374");
    }

    public Student(String firstName, String lastName, long phoneNumber,String course, int age, String emailId, String uniqueID, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.age = age;
        this.emailId = emailId;
        this.uniqueID = uniqueID;
        this.address = address;
    }

//    Code to add new student
    public static void addStudent(){
        System.out.println("--------------");
        System.out.println("Adding new student to the table");
        Student student = new Student("John","Kim",928472633,"MACS",25,
                "john@gmail.com","B00928374","Halifax");
        Student student2 = new Student("Mychal","Kate",928418233,"MACS",
                22,"mychal@gmail.com","B00932974","Halifax");
        studentsList.add(student);
        studentsList.add(student2);
        System.out.println("Details of the student added was:");
        displayStudents();
    }

//    Code to display students
    public static void displayStudents(){
        System.out.println("------------");
        System.out.println("List of all students: ");
        for(Student student: studentsList){
            System.out.println(student.getFirstName()+"" +
                    " "+student.getLastName()+" ,"+student.getEmailId()+"" +
                    ","+student.getPhoneNumber()+"," +
                    student.getAddress());
        }
    }

//    Code to get students by Id
    public static void getStudentById(String id){
        Student student=null;
        System.out.println("----------------------------------------");
        System.out.println("Get students by ID");
        for(Student currStudent:studentsList){
            if(currStudent.getUniqueID()==id){
                student = currStudent;
                System.out.println("Students details with id="+id+"is :");
                System.out.println(student.getFirstName()+"" +
                        " "+student.getLastName()+" ,"+student.getEmailId()+"" +student.getCourse()+
                        ","+student.getPhoneNumber()+"," +
                        student.getAddress());
                break;
            }
        }
        if(student==null){
            System.out.println("Student with id = "+id+" not found");
        }
    }

//    Code to delete student record
    public static void deleteStudent(String id){
        boolean flag=false;
        System.out.println("------------------------------------------");
        System.out.println("Deleting a student with id ");
        for(Student currStudent:studentsList){
            if(currStudent.getUniqueID()==id){
                flag=true;
               studentsList.remove(currStudent);
               break;
            }
        }
        if(flag){
            System.out.println("Student was sucessfully deleted. Students list after deleting a student with id "+id);
            displayStudents();
        }
        else{
            System.out.println("Student with id "+id+" was not present in the data");
        }
    }

//    Code to update student information
    public static void updateStudent(String id, Student updatedDetails){
        boolean flag=false;
        System.out.println("----------------------------------------");
        System.out.println("Updating existing user details");
        for(Student student: studentsList){
            if(student.getUniqueID()==id){
                studentsList.remove(student);
                studentsList.add(updatedDetails);
                flag=true;
                break;
            }
        }
        if(flag){
            displayStudents();
        }
        else{
            System.out.println("Student details not valid");
        }
    }
}
