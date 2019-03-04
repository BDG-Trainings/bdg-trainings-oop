package com.bdg.agalayan.bankAccountSystem.service;

import com.bdg.agalayan.bankAccountSystem.entity.Address;

public class CustomerCreateParameter {
    private String customerName;
    private String customerSurname;
    private Address address;

    public CustomerCreateParameter(String customerName, String customerSurname, Address address){
        this.customerName=customerName;
        this.customerSurname=customerSurname;
        this.address=address;

    }

    public Address getAddress() {
        return address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }
}
