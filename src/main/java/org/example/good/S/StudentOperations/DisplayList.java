package org.example.good.S.StudentOperations;

import org.example.bad.S.Student;
import org.example.good.S.IDatabase;
import org.example.good.S.StudentDAO;

import java.util.ArrayList;

public class DisplayList {
    public void displayData(IDatabase database){
        ArrayList<StudentDAO> myList = new ArrayList<StudentDAO>();
        myList = database.getData();


        System.out.println("------------");
        System.out.println("List of all students: ");
        for(StudentDAO student: myList){
            System.out.println(student.getFirstName()+"" +
                    " "+student.getLastName()+" ,"+student.getEmailId()+"" +
                    ","+student.getPhoneNumber()+"," +
                    student.getAddress());

        }
    }
}

