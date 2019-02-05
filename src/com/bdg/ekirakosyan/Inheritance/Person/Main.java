package Inheritance.Person;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Joe Doe", "504 N Louise Ave apt 5", "progam 1", 2015, 1200);
        System.out.println(student1);

        Staff staffMember1 = new Staff("Lora D.", "101 N Columbus Ave apt 3", "School 1", 590);
        System.out.println(staffMember1);

    }
}

