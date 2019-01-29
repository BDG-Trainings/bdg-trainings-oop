package Lessons_07;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(final String id, final String desc, final int qty,final double unitPrice){
        this.id =id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice=unitPrice;
    }
    public String getId(){
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

    public void setId(String id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    } public double getTotal(){
        return unitPrice*qty;
    }
    @Override
    public String toString(){
        return "InvoiceItem [ID="+ id +"," + "desc ="+ desc + ","+
                "qty="+ qty+ ","+ "unitPrice="+ unitPrice+ "]";
    }
    public static void main(String []args){
        InvoiceItem a = new InvoiceItem("Id", "desc", 25, 255.000);
        System.out.println(a.toString());
        System.out.println(a.getTotal());

    }
}
