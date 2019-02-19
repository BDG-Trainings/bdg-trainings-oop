package bas;


import BookStorage.BookService;

public final class BankSystem {

    public static void main(String[] args) {
        BankService service = new BankService(10);

        Account[] accounts = new Account[3];
        Customer c = new Customer("Anun1", "Azganun1",
                new Address(Country.AM, "Poxoc1", "+37495821456"), 1);
        accounts[0] = new Account(c, new AccountBalance(30000));
        accounts[0].deposit(20000);
        accounts[0].withdraw(60000);
        accounts[1] = new Account(new Customer("Anun2", "Azganun2",
                new Address(Country.AM, "poxoc2", "+37455621284"), 2),
                new AccountBalance(60000));

        service.create("Anun3", "Azganun3", Country.AM,
                "Poxoc3", "+37455623189", 25000);
        service.create("Anun4", "Azganun4", Country.AM,
                "Poxoc4", "+37495126548", 65000);
        Account[] a = service.findAllAccountsByCountry(Country.AF);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + ",");
        }
        System.out.println(service.transfer(accounts[0], accounts[1], 10000));
        Account[] b = service.findAllAccountWithBalanceRange(20000, 70000);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + ",");
        }
        System.out.println(service.findByCustomerName("Anun5"));
        //Add missing functionality
    }
}


