package com.bdg.agalayan.bankAccountSystem.service;

import com.bdg.agalayan.bankAccountSystem.entity.Account;

public interface AccountService {

    Account get(int id);

    Account create(AccountCreateParameter parameter);

    boolean delete(int id);

}
