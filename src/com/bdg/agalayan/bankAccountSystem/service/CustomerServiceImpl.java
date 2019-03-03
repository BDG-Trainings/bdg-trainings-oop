package com.bdg.agalayan.bankAccountSystem.service;

import com.bdg.agalayan.bankAccountSystem.entity.Customer;

public class CustomerServiceImpl implements CustomerService {
    private Customer[] customers;
    private int currentCustomer;

    @Override
    public Customer get(int id) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == id) {
                return customers[i];
            }
        }
        return null;
    }

    @Override
    public Customer create(Customer customer) {
        if (currentCustomer < customers.length) {
            customers[currentCustomer] = customer;
            currentCustomer++;
        }
        return null;
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
            Customer[] customers1 = new Customer[customers.length];
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
