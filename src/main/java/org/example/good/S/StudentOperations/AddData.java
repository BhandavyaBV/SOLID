package org.example.good.S.StudentOperations;

import org.example.good.S.IDatabase;
import org.example.good.S.StudentDAO;

public class AddData {

    public void AddData(IDatabase database){
        System.out.println("--------------");
        System.out.println("Adding new student to the table");
        StudentDAO student = new StudentDAO("John","Kim",928472633,25,"john@gmail.com","B00928374","Halifax");
        StudentDAO student2 = new StudentDAO("Mychal","Kate",928418233,22,"mychal@gmail.com","B00932974","Halifax");
        database.addData(student);
        database.addData(student2);
    }
}
