package com.bdg.osahakyan.designpattern.mvc;

public class MVCPatternDemo {

    public static void main(String[] args){

        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);

        controller.updateView();
        controller.setStudentName("John");
        controller.setStudentName("Paul");

        controller.updateView();
        controller.setStudentRollNo("22");

        controller.updateView();


    }

    private static Student  retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Mark");
        student.setRollNo("11");
        return student;
    }
}
