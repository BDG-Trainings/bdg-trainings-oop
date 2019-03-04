package com.bdg.agalayan.bankAccountSystem.service;

import com.bdg.agalayan.bankAccountSystem.entity.Account;
import com.bdg.agalayan.bankAccountSystem.entity.Address;
import com.bdg.agalayan.bankAccountSystem.entity.Customer;
import com.bdg.agalayan.bankAccountSystem.entity.PhoneNumber;
import com.bdg.agalayan.bankAccountSystem.enums.Country;
import com.bdg.agalayan.bankAccountSystem.enums.CountryCode;
import com.bdg.agalayan.bankAccountSystem.enums.PhoneType;

public class AccountServiceImpl implements AccountService {
    private Account[] accounts;
    private int currentAccount;


    //This is service class and responsible to create or return account
    //remove this constructor parameter
    public AccountServiceImpl() {

    }

    @Override
    public Account get(int id) {
        for (int i = 0; i < currentAccount; i++) {
            if (accounts[i].getId() == id) {
                return accounts[i];
            }
        }
        return null;
    }

    //This method should accept parameters and create Account according that parameters
    @Override
    public Account create(AccountCreateParameter parameter) {
        Account account= new Account(parameter.getCustomer(), parameter.getCreditCard(), parameter.getAccountBalance());
        int i=0;
        if (i<currentAccount) {
            accounts[i] = account;
            i++;

        }
        return account;
    }


    @Override
    public boolean delete(int id) {
        boolean t = false;
        for (int i = 0; i < currentAccount; i++) {
            if (accounts[i].getId() == id) {
                t = true;
            }
        }
        if (t) {
            Account[] accounts1 = new Account[accounts.length];
            for (int j = 0; j < currentAccount; j++) {
                if (accounts[j].getId() != id) {
                    accounts1[j] = accounts[j];

                }

            }
            currentAccount--;
            accounts = accounts1;
            return true;
        } else {
            return false;

        }
    }


}
