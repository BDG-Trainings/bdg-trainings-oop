package com.bdg.agalayan.bankAccountSystem;

import com.bdg.agalayan.bankAccountSystem.entity.*;
import com.bdg.agalayan.bankAccountSystem.enums.CardType;
import com.bdg.agalayan.bankAccountSystem.enums.Country;
import com.bdg.agalayan.bankAccountSystem.enums.CountryCode;
import com.bdg.agalayan.bankAccountSystem.enums.PhoneType;
import com.bdg.agalayan.bankAccountSystem.service.*;
import com.bdg.agalayan.bas.AccountBalance;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        PhoneNumber[]numbers=new PhoneNumber[2];
        numbers[0]= new PhoneNumber(PhoneType.MOBILE, "091234567", CountryCode.AM);
        Address address= new Address(Country.FR, "street1", numbers);
        Customer customer= new Customer("name1", "surname1",address);
        CreditCard creditCard= new CreditCard(1, LocalDate.now(), CardType.CLASSIC);
        AccountBalance balance= new AccountBalance(200000.0);
        Account account =new Account(customer, creditCard,balance );
        System.out.println(customer.getAddress());
        System.out.println(account.getAccountBalance());
        System.out.println(account.getCreditCard());
        System.out.println(account.getCustomer());
        AccountServiceImpl accountService= new AccountServiceImpl();
        AccountCreateParameter parameter=new AccountCreateParameter(customer, creditCard, balance);
        System.out.println(accountService.create(parameter));
        System.out.println(accountService.delete(1));
        System.out.println(accountService.get(1));
        CustomerServiceImpl service=new CustomerServiceImpl();
        CustomerCreateParameter parameter1=new CustomerCreateParameter("name2", "surname2", address);
        System.out.println(service.create(parameter1));
        System.out.println(service.delete(3));
        System.out.println(service.get(2));
        System.out.println(parameter1.getCustomerSurname());
        System.out.println(parameter1.getAddress());




    }
    }

