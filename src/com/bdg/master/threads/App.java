package com.bdg.master.threads;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {


    synchronized void doSomething() {
        int x = 100;
        int y = 200;
    }

    public static void main(String[] args) {
        App app = new App();
        app.doSomething();


    }
}

class PhoneD implements Map<String, String> {

    private Map<String, String> map;

    public PhoneD() {
        this.map = new HashMap<>();
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public String get(Object key) {
        return null;
    }

    @Override
    public String put(String key, String value) {
        return null;
    }

    @Override
    public String remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ? extends String> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Collection<String> values() {
        return null;
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
        return null;
    }
}
