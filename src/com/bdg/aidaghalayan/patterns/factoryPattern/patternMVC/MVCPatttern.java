package com.bdg.aidaghalayan.patterns.factoryPattern.patternMVC;

class MVCPattern {
    public static void main(String[] args) {
        Student model= retriveStudentFromDatabase();
        StudentView view= new StudentView();
        StudentController controller= new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Anna");
        controller.updateView();

            }

    private static Student retriveStudentFromDatabase() {
        Student student= new Student();
        student.setName("Anna");
        student.setRollNo("10AC120");
        return student;
    }
}
