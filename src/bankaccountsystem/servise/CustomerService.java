package bankaccountsystem.servise;

import bankaccountsystem.objects.Address;
import bankaccountsystem.objects.Customer;

public interface CustomerService {

    Customer create(String customerName, String customerSurname, Address customerAddress);
}
