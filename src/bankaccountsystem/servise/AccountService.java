package bankaccountsystem.servise;

import bankaccountsystem.objects.Account;
import bankaccountsystem.objects.AccountBalance;
import bankaccountsystem.objects.CreditCard;
import bankaccountsystem.objects.Customer;

public interface AccountService {

    Account create(Customer customer, CreditCard creditCard, AccountBalance accountBalance);

}
