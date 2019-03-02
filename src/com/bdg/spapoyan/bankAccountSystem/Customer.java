package com.bdg.spapoyan.bankAccountSystem;

import com.bdg.spapoyan.bankAccountSystem.entity.AbstractBankEntity;

public class Customer extends AbstractBankEntity {

    private String customerName;
    private String customerSurname;
    private Address customerAddress;

    public Customer(final int id, final String customerName, final String customerSurname, final Address customerAddress) {
        super(id);
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerAddress = customerAddress;
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

    public Address getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerSurname='" + customerSurname + '\'' +
                ", customerAddress=" + customerAddress +
                '}';
    }
}
