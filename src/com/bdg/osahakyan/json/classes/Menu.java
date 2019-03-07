package com.bdg.osahakyan.json.classes;

public class Menu {

    private String id;
    private String value;
    private Popup popup;

    public Menu(String id, String value, Popup popup) {
        this.id = id;
        this.value = value;
        this.popup = popup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Popup getPopup() {
        return popup;
    }

    public void setPopup(Popup popup) {
        this.popup = popup;
    }
}
