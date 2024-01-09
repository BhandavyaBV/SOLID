package org.example.good.S;

import java.util.ArrayList;

public interface IDatabase {
    public ArrayList<StudentDAO> getData();

    public void addData(StudentDAO student);

    public void updateData(ArrayList<StudentDAO> studentList);

}
