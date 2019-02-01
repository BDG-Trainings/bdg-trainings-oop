package com.bdg.ekirakosyan.InvoceItem;

public class InvoceItem {
    String id;
    String desc;
    int qty;
    double unitPrice;

    public InvoceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        double total = getUnitPrice() * getQty();
        return total;
    }

    @Override
    public String toString() {
        return "InvoceItem[id="+getId()+", Description: "+getDesc()+", qty="+getQty()+", unitPrice="+getUnitPrice();
    }
}
