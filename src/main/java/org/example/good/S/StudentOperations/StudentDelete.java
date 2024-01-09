package org.example.good.S.StudentOperations;


import org.example.good.S.IDatabase;
import org.example.good.S.StudentDAO;

import java.util.ArrayList;

public class StudentDelete {
    public void deleteStudentById(String id, IDatabase database){

        ArrayList<StudentDAO> studentsList = new ArrayList<StudentDAO>();
        studentsList = database.getData();

        boolean flag=false;
        System.out.println("------------------------------------------");
        System.out.println("Deleting a student with id ");
        for(StudentDAO currStudent:studentsList){
            if(currStudent.getUniqueID()==id){
                flag=true;
                studentsList.remove(currStudent);
                break;
            }
        }
        if(flag){
            database.updateData(studentsList);
            System.out.println("Student was sucessfully deleted. Students list after deleting a student with id "+id);
            DisplayList display = new DisplayList();
            display.displayData(database);
        }
        else{
            System.out.println("Student with id "+id+" was not present in the data");
        }
    }
}
