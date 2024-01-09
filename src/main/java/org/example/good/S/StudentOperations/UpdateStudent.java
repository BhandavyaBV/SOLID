package org.example.good.S.StudentOperations;

import org.example.bad.S.Student;
import org.example.good.S.IDatabase;
import org.example.good.S.StudentDAO;

import java.util.ArrayList;

public class UpdateStudent {
    public void updateStudent(String id, StudentDAO updatedDetails, IDatabase database){
        ArrayList<StudentDAO> studentsList = new ArrayList<StudentDAO>();
        studentsList = database.getData();

        boolean flag=false;
        System.out.println("----------------------------------------");
        System.out.println("Updating existing user details");
        for(StudentDAO student: studentsList){
            if(student.getUniqueID()==id){
                studentsList.remove(student);
                studentsList.add(updatedDetails);
                flag=true;
                break;
            }
        }
        if(flag){
            database.updateData(studentsList);
           DisplayList display = new DisplayList();
           display.displayData(database);
        }
        else{
            System.out.println("Student details not valid");
        }
    }
}
