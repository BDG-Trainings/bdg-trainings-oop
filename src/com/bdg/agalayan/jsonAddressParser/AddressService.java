package com.bdg.agalayan.jsonAddressParser;

import com.bdg.agalayan.bankAccountSystem.entity.Address;

public interface AddressService {

    Address create (String jsonAddressContent);
}
