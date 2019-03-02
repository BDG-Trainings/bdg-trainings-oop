package com.bdg.warustamyan.bankaccountsystem.entity;


public final class Customer extends AbstractBankEntity {

    private String customerName;
    private String customerSurname;
    private Address customerAddress;

    public Customer(final String customerName, final String customerSurname, final Address customerAddress) {
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerAddress = customerAddress;
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
