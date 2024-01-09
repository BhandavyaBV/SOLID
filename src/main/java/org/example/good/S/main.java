package org.example.good.S;


import org.example.good.S.StudentOperations.*;

public class main {

    public static IDatabase database = new DatabaseImpl();
    public static void main(String[] args){

//        Add new entry into the data
        AddData addData = new AddData();
        addData.AddData(database);

//        Display data
        DisplayList displayData = new DisplayList();
        displayData.displayData(database);

//        Get student details by ID
        GetStudentByID getStudentByID = new GetStudentByID();
        getStudentByID.getStudentById("B00928374",database);

//        Update student
        UpdateStudent update = new UpdateStudent();
        update.updateStudent("B00928374",new StudentDAO("James",
                "Kim",
                928472633,
                25,
                "john@gmail.com",
                "B00928374",
                "Halifax"),database);

//        Delete Student
        StudentDelete delete = new StudentDelete();
        delete.deleteStudentById("B00928374",database);
    }
}
