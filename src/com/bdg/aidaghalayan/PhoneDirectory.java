package com.bdg.aidaghalayan;

import java.util.HashMap;

public class PhoneDirectory {
    //Also you can change HashMap reference with Map
    private HashMap<String, String> hashMap = new HashMap<>();


    public PhoneDirectory(String name, String number) {
        hashMap.put(name, number);


    }

    //Need to return found object instead of check if exists.
    private boolean find(String name) {
        return hashMap.get(name) != null;
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

        System.out.println(directory.find("sdf"));
        System.out.println(directory.getNumber("Davit"));
        directory.removeContact("Anna");
        System.out.println(directory.getNumber("Anna"));



    }

}