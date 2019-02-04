package com.bdg.hhertevtsyan.personandsubclasses;

public class App {
    public static void main(String[] args) {
        Student student = new Student("armen", "asatryan", "vazgeni", (short) 19, "Yerevan, Arshakunyats 11, apt. 54", "Bachelor", 3, 300000);
    Staff staff = new Staff("armen", "asatryan", "vazgeni", (short) 19, "Yerevan, Arshakunyats 11, apt. 54", "Siamanto", 50000);
        System.out.println(student.getFullName());
    }

}
