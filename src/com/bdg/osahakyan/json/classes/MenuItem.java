package com.bdg.osahakyan.json.classes;

import com.bdg.osahakyan.json.enums.Onclick;
import com.bdg.osahakyan.json.enums.Value;

public class MenuItem {

    private Value value;
    private Onclick onclick;

    public MenuItem(Value value, Onclick onclick) {
        this.value = value;
        this.onclick = onclick;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Onclick getOnclick() {
        return onclick;
    }

    public void setOnclick(Onclick onclick) {
        this.onclick = onclick;
    }
}
