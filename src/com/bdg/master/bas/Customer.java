package com.bdg.master.bas;


public final class Customer {

    private int customerId;
    private String customerName;
    private String customerSurname;
    private Address address;

    public  Customer(String customerName,String customerSurname,Address address){

        this.customerName    = customerName;
        this.customerSurname = customerSurname;
        this.address         = address;

    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{"+
                    "id:"+ '\'' + getCustomerId() + '\''+
                    ",name:"+ '\'' + getCustomerName() + '\''+
                    ",surname:" + '\'' + getCustomerSurname() + '\''+"" +
                    ",address:" + getAddress() + "}";
    }
}
