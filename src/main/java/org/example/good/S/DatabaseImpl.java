package org.example.good.S;

import java.util.ArrayList;

public class DatabaseImpl implements IDatabase{

    public static ArrayList<StudentDAO> studentList= new ArrayList<StudentDAO>();

    public ArrayList<StudentDAO> getData(){
        return studentList;
    }

    public void addData(StudentDAO student){
        studentList.add(student);
    }

    public void updateData(ArrayList<StudentDAO> newList){
        studentList = newList;
    }
}
