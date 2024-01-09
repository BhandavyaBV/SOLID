package org.example.good.S.StudentOperations;

import org.example.bad.S.Student;
import org.example.good.S.IDatabase;
import org.example.good.S.StudentDAO;

import java.util.ArrayList;

public class GetStudentByID {

    public void getStudentById(String id, IDatabase database){
        ArrayList<StudentDAO> studentsList = new ArrayList<StudentDAO>();
        studentsList = database.getData();
        StudentDAO student=null;
        System.out.println("----------------------------------------");
        System.out.println("Get students by ID");
        for(StudentDAO currStudent:studentsList){
            if(currStudent.getUniqueID()==id){
                student = currStudent;
                System.out.println("Students details with id="+id+" is :");
                System.out.println(student.getFirstName()+"" +
                        " "+student.getLastName()+" ,"+student.getEmailId()+"" +
                        ","+student.getPhoneNumber()+"," +
                        student.getAddress());
                break;
            }
        }
        if(student==null){
            System.out.println("Student with id = "+id+" not found");
        }
    }
}
