package com.bdg.osahakyan.invoiceitem;

public class MainInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem ("081", "current", 50, 7.9);
        System.out.println(invoiceItem.toString());
        System.out.println(invoiceItem.getTotal());
    }
}
