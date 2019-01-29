package aiskandaryan.Lesson_07;

public class InvoiceItem {
    //Make private
    String id;
    String decs;
    int qty;
    double unitPrice;

    public InvoiceItem(final String id, final String desc, final int qty, final int unitPrice) {
        this.id = id;
        this.decs = desc;
        if (qty >= 0) {
            this.qty = qty;
        } else {
            this.qty = 0;
        }
        if (unitPrice >= 0) {
            this.unitPrice = unitPrice;
        } else {
            this.unitPrice = 0;
        }
    }

    public String getId() {
        return id;
    }

    public String getDecs() {
        return decs;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(final int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(final double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return qty * unitPrice;
    }

    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + decs + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}
