package com.bdg.master.interfaces.geometricobject;


public class Printer implements MessagePrintable, Printable {


    @Override
    public void print() {

    }

    public static void main(String[] args) {
        MessagePrintable p = new Printer();
        p.print();
    }
}































