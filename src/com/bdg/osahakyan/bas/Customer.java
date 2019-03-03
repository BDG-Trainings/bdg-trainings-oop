package com.bdg.osahakyan.bas;

public final class Customer {

    private int customerId;
    private String customerName;
    private String customerSurname;
    private Address address;

    public Customer( String customerName, String customerSurname, Address address) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerSurname(){
        return customerSurname;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString(){
        return "Customer (" +
                "CustomerId: " + customerId +
                ", CustomerName: " + customerName +
                ", CustomerSurname:" + customerSurname +
                ", Address" + address +
                ")";
    }
}
