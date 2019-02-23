package com.bdg.hhertevtsyan.banksystem;

public final class Customer {

    private int customerId =0;
    private String customerName;
    private String customerSurname;
    private Address address;

    public Customer (final int customerId, final String customerName, final String customerSurname, final Address address) {
        this.customerId = customerId;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer [ ID = " + customerId + ", Name = " + customerName + ", Surname = " + customerSurname + ", Address = " + address.toString() + "]";
    }
}