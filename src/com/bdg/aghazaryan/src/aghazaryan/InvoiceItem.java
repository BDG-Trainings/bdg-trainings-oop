package aghazaryan;

public class InvoiceItem {
   private String id;
   private String desc;
   private int qty;
   private double unitPrice;
   
   public InvoiceItem (String id, String desc, int qty, double unitPrice) {
	   this.id = id;
	   this.desc = desc;
	   this.qty = qty;
	   this.unitPrice = unitPrice;	   
	      
   }
   
   public String getID() {
	   return id;
   }
	public String getDesc() {
		return desc;
	}	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitprice(double unitPrice) {
		
	}
	public double getTotal() {
		return unitPrice * qty;
	}
	public String toString() {
		 return "InvoiceItem[id= " + id + " desc =" + desc + " qty =" + qty + " unitPrice = " + unitPrice + "]";

	}
	public static void main (String[] args) {
		InvoiceItem invoice = new InvoiceItem("number 1", "book", 5, 60.6);
		System.out.println(invoice.id);
		System.out.println(invoice.desc);
		System.out.println(invoice.qty);
		System.out.println(invoice.unitPrice);
	}
}
