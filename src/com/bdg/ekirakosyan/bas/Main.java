package bas;

public class Main {
    public static void main(String[] args) {

        Country cName = Country.findByCountryName("Afghanistan");
        Country cCode = Country.findByNumericCode("380");

        System.out.println(cName);
        System.out.println(cCode);

        Address address1 = new Address(Country.AM, "Street 1", "1232132");
        Address address2 = new Address(Country.FR, "Street 2", "0787987");
        Address address3 = new Address(Country.IT, "Street 3", "8235632");
        Address address4 = new Address(Country.US, "Street 4", "6756756");

        Customer customer1 = new Customer("Customer 1", "CSurname 1", address1);
        Customer customer2 = new Customer("Customer 2", "CSurname 2", address2);
        Customer customer3 = new Customer("Customer 3", "CSurname 3", address3);
        Customer customer4 = new Customer("Customer 4", "CSurname 4", address4);

        AccountBalance accountBalance1 = new AccountBalance(23434.23);
        AccountBalance accountBalance2 = new AccountBalance(5656.23);
        AccountBalance accountBalance3 = new AccountBalance(789.23);
        AccountBalance accountBalance4 = new AccountBalance(6867.23);

        Account account1 = new Account(customer1, accountBalance1);
        Account account2 = new Account(customer2, accountBalance2);
        Account account3 = new Account(customer3, accountBalance3);
        Account account4 = new Account(customer4, accountBalance4);

        Account[] accounts={account1,account2,account3,account4};

        BankService bas = new BankService(4);
        System.out.println(bas.findAllAccountWithBalanceRange(5000, 6000));

    }
}
