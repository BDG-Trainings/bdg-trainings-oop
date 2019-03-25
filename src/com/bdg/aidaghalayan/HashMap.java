package com.bdg.aidaghalayan;


import java.util.Arrays;
import java.util.LinkedList;


public class HashMap {
    private String key;
    private String value;
    Object []objects = new Object[16];


    public String get(String key){
        int i = Math.abs(key.hashCode()) % 16;

            return String.valueOf(objects[i]);
        }

    public void put(String key, String value) {
        int i = Math.abs(key.hashCode()) % 16;
        if (objects[i] == null) {
            this.value = value;
        }
       LinkedList list = new LinkedList<>();

        list.add(value);
        objects[i]=list;

    }

    public String remove(String key){

return null;
    }
    public boolean containsKey(String key){
        for(int i =0; i<objects.length; i++){
            if(objects[i]==key){
                return true;
            }
        }
        return false;
    }

    public int size(){
     return objects.length;
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
        map.put("3", "ccc");
        map.put("njnnj", "ddd");
        map.put("njnnla", "eee");
        map.put("njnnlas", "fff");
        map.put("njnnls", "ggg");
        map.put("njnnldf", "hhh");
        map.put("njnnlfg", "iii");
        map.put("njnnlfh", "jjj");
        map.put("njnnlgf", "kkk");
        map.put("njnnlddfs", "lll");
        System.out.println(map.toString());
        System.out.println(map.get("njnnls"));
        System.out.println(map.containsKey("njnnlgf"));
        System.out.println(map.size());
    }
}

