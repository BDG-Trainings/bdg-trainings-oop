package com.bdg.agalayan.bankAccountSystem.service;

import com.bdg.agalayan.bankAccountSystem.entity.Customer;

public class CustomerServiceImpl implements CustomerService {
    private Customer[] customers= new Customer[10];
    private int currentCustomer;

    @Override
    public Customer get(int id) {
        for (int i = 0; i < currentCustomer; i++) {
            if (customers[i].getId() == id) {
                return customers[i];
            }
        }
        return null;
    }

    @Override
    public Customer create(CustomerCreateParameter parameter) {
        Customer customer=new Customer(parameter.getCustomerName(), parameter.getCustomerSurname(),parameter.getAddress());

        if (currentCustomer< customers.length) {
            customers[currentCustomer] = customer;
            currentCustomer++;
        }
        return customer;
    }

    @Override
    public boolean delete(int id) {
        boolean t = false;
        for (int i = 0; i < currentCustomer; i++) {
            if (customers[i].getId() == id) {
                t = true;
            }
        }
        if (t = true) {
            Customer[] customers1 = new Customer[currentCustomer];
            for (int j = 0; j < currentCustomer; j++) {
                if (customers[j].getId() != id) {
                    customers1[j] = customers[j];

                }

            }
            currentCustomer--;
            customers = customers1;
            return true;
        } else {
            return false;

        }
    }
}
