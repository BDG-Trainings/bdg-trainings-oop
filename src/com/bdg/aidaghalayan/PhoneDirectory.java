package com.bdg.aidaghalayan;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

    private Map <String, String> hashMap = new HashMap<>();


    public PhoneDirectory(String name, String number) {
        hashMap.put(name, number);
    }
    private String find(String name) {
        String number=hashMap.get(name);
        if(hashMap.get(name)!= null){
            return number;
        }

        return "This number does not exist";
    }
    private String getNumber(String name) {
        return hashMap.get(name);
    }
    private void putNumber(String name, String number){
        hashMap.put(name, number);
    }
    private void removeContact(String name){

        hashMap.remove(name);
    }
    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory("Anna", "098524163");
        directory.putNumber("Davit", "095623145");
        System.out.println(directory.find("Ann"));
        System.out.println(directory.getNumber("Davit"));
        directory.removeContact("Anna");
        System.out.println(directory.getNumber("Anna"));
    }

}