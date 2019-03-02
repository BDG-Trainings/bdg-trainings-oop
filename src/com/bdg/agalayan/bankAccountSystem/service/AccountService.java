package com.bdg.agalayan.bankAccountSystem.service;

import com.bdg.agalayan.bankAccountSystem.entity.Account;

public interface AccountService {

    Account get(int id);

    Account create (Account account);

    boolean delete (int id);

}
