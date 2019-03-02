package com.bdg.agalayan.bankAccountSystem;

import com.bdg.agalayan.lessons_07.Date;

public class Customer extends AbstractBankEntity {
    private String customerName;
    private String customerSurname;
    private Address address;

    Customer(int id, String customerName, String customerSurname, Address address) {
        super(id);
        this.customerName=customerName;
        this.customerSurname=customerSurname;
        this.address=address;
    }

    @Override
    public Date getCreatedDate() {
        return super.getCreatedDate();
    }

    @Override
    public Date getUpdatedDate() {
        return super.getUpdatedDate();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setCreatedDate(Date createdDate) {
        super.setCreatedDate(createdDate);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setUpdatedDate(Date updatedDate) {
        super.setUpdatedDate(updatedDate);
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
