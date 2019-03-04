package com.bdg.agalayan.bankAccountSystem.entity;

import java.time.LocalDate;

public class Customer extends AbstractBankEntity {
    private String customerName;
    private String customerSurname;
    private Address address;



    Customer(int id,String customerName, String customerSurname, Address address) {
        super(id);
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.address = address;
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

    public String getCustomerName() {
        return customerName;
    }

    public Address getAddress() {
        return address;
    }

}
