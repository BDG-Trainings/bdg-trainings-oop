package com.bdg.aidaghalayan;


import java.util.Arrays;
import java.util.LinkedList;

import static java.util.LinkedList.*;

public class HashMap {
    private String key;
    private String value;
    Object []objects = new Object[16];


    public String get(String key){
       return null;



    }
    public LinkedList put(String key, String value) {
        int i = Math.abs(key.hashCode()) % 16;
        if (objects[i] == null) {
            this.value = value;
        }
        LinkedList <String> list= new LinkedList<>();
        objects[i] = list;
        list.add(value);
        return  list;
    }

    public String remove(String key){

return null;
    }
    public boolean containsKey(String key){
return false;
    }
    public int size(){
return Integer.parseInt(null);
    }

    @Override
    public String toString() {
        return "HashMap{"  +
                "objects=" + Arrays.toString(objects) +
                '}';
    }

    public static void main(String[] args) {
        HashMap map= new HashMap();
        map.put("1", "aaa");
        map.put("2", "bbb");
        map.put("3", "bbb");
        map.put("njnnj", "bbb");
        map.put("njnnla", "bbb");
        map.put("njnnlas", "bbb");
        map.put("njnnls", "bbb");
        map.put("njnnldf", "bbb");
        map.put("njnnlfg", "bbb");
        map.put("njnnlfh", "bbb");
        map.put("njnnlgf", "bbb");
        map.put("njnnlddfs", "bbb");
        System.out.println(map.toString());
        System.out.println(map.get("njnnls"));
    }
}

