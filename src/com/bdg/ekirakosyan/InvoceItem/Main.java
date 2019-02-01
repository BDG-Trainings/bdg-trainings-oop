package com.bdg.ekirakosyan.InvoceItem;

public class Main {
    public static void main(String[] args) {
        InvoceItem item = new InvoceItem("id-1", "Desc for 1st item", 15, 77.8);

        System.out.println(item.toString());
        System.out.println("Total: " + item.getTotal());
    }
}
