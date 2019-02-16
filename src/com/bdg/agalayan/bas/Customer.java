package bas;


public final class Customer {

    private int customerId;
    private String customerName;
    private String customerSurname;
    private Address address;

    Customer(String customerName, String customerSurname, Address address, int customerId){
        this.address=address;
        this.customerId=customerId;
        this.customerName=customerName;
        this.customerSurname=customerSurname;

    }

    public int getCustomerId() {
        return customerId;
    }

    public Address getAddress() {
        return address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }
}
