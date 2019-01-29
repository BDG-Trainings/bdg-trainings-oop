package com.bdg.vkaramyan;

public class InvoiceItem {
	
	private String id; //<- private
	private String desc;
	private int qty;
	private double unitPrice;
	
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
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
		this.qty = qty;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getTotal() {
		double total = unitPrice*qty;
		return total;
	}
	
	public String toString() {
		return String.format("InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice = %f]", getID(), getDesc(), getQty(), getUnitPrice());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvoiceItem invoiceItem = new InvoiceItem("1", "Java book", 1, 9000);
		System.out.println(invoiceItem);
		invoiceItem.setQty(3);
		invoiceItem.setUnitPrice(3500);
		System.out.println(invoiceItem.getTotal());
		System.out.println(invoiceItem.toString());

	}


}
