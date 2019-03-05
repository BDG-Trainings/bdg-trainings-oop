package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.service;

import com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.Account;

public interface AccountService {

    Account create (Account createParameter);

    Account update (Account createParameter);

    Account delete ();

    Account get ();


}
