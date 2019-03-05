package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.service;

import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.Account;
import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.AccountBalance;
import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.CreditCard;

public abstract class AccountServiceImpl implements AccountService {

    @Override
    public Account create(final Account createParameter) {

        final Account account = new Account(createParameter.getCustomer(), createParameter.getCreditCard(), (createParameter.getAccountBalance()));

        return account;
    }

    @Override

    public Account update(final Account updateParameter) {

        final Account account = new Account(updateParameter.getCustomer(), updateParameter.getCreditCard(), (updateParameter.getAccountBalance()));

        return account;
        {
            return null;
        }
        @Override
        public Account delete () {
            return null;
        }

        @Override
        public Account get () {
            return null;
        }
    }
}