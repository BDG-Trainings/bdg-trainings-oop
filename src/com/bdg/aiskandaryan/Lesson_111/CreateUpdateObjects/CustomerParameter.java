package com.bdg.aiskandaryan.Lesson_111.CreateUpdateObjects;

import com.bdg.aiskandaryan.Lesson_111.Address;

public class CustomerParameter {
    private String customerName;
    private String customerSurname;
    private Address customerAddress;

    public CustomerParameter(final String customerName, final String customerSurname, final Address customerAddress) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerAddress = customerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }
}
