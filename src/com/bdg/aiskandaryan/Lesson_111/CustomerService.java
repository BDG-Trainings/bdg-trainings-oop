package com.bdg.aiskandaryan.Lesson_111;

import com.bdg.aiskandaryan.Lesson_111.CreateUpdateObjects.CustomerParameter;
import com.bdg.aiskandaryan.Lesson_111.Entities.Country;
import com.bdg.aiskandaryan.Lesson_111.Entities.PhoneNumber;

import java.time.LocalDate;

public class CustomerService {
    private Customer[] customers;
    private int customersCount;
    private final int maxCustomersCount = 10;

    public CustomerService() {
        this.customers = new Customer[maxCustomersCount];
        this.customersCount = 0;
    }

    public Customer getCustomer(final int i) {
        if (i < customersCount && i >= 0) {
            return customers[i];
        } else {
            return null;
        }
    }

    public boolean addCustomer(final CustomerParameter customerParameter) {
        if (customersCount < maxCustomersCount) {
            Customer newCustomer = new Customer(customersCount, customerParameter.getCustomerName(), customerParameter.getCustomerSurname(), customerParameter.getCustomerAddress());
            newCustomer.setCreatedDate(LocalDate.now());
            this.customers[customersCount] = newCustomer;
            customersCount++;
            return true;
        } else {
            System.err.println("Add customer -> Customers maximum count exceeded !!!");
            return false;
        }
    }

    public boolean updateCustomer(final int id, final CustomerParameter customerParameter) {
        Customer customer = getCustomer(id);
        if (customer != null) {
            customer.setCustomerName(customerParameter.getCustomerName());
            customer.setCustomerSurname(customerParameter.getCustomerSurname());
            customer.setCustomerAddress(customerParameter.getCustomerAddress());
            customer.setUpdatedDate(LocalDate.now());
            return true;
        } else {
            System.err.println("Update customer -> Customer not found !!!");
            return false;
        }
    }

    public boolean deleteCustomer(final int id) {
        Customer customer = getCustomer(id);
        if (customer != null) {
            customer.setDeletedDate(LocalDate.now());
            return true;
        } else {
            System.err.println("Delete customer -> Customer not found !!!");
            return false;
        }
    }

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();

        customerService.addCustomer(new CustomerParameter("Customer#1F", "Customer#1L", new Address(Country.AM, "Customer #1 Street", new PhoneNumber[1])));
        customerService.updateCustomer(0, new CustomerParameter("UpdatedF", "UpdatedL", customerService.getCustomer(0).getCustomerAddress()));
        System.out.println(customerService.getCustomer(0).getCustomerName());
        System.out.println(customerService.getCustomer(0).getCustomerSurname());
        System.out.println(customerService.getCustomer(0).getCustomerAddress());
        System.out.println(customerService.getCustomer(0).getCreatedDate());
        System.out.println(customerService.getCustomer(0).getUpdatedDate());
        System.out.println(customerService.getCustomer(0).getDeletedDate());
    }
}
