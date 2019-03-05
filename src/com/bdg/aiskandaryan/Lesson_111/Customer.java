package com.bdg.aiskandaryan.Lesson_111;

import com.bdg.aiskandaryan.Lesson_111.Entities.AbstractBankEntity;

public class Customer extends AbstractBankEntity {

    private String customerName;
    private String customerSurname;
    private Address customerAddress;

    public Customer(final int id, final String customerName, final String customerSurname, final Address customerAddress) {
        super(id);
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerAddress = customerAddress;
        this.setDeletedDate(null);
        this.setUpdatedDate(null);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(final String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(final String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(final Address customerAddress) {
        this.customerAddress = customerAddress;
    }
}
