public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    public Account(){
        this(12, 36, "Marcos", "asdads", "23423");
        System.out.println("Default values");
    }
    public Account(int number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

        System.out.println("the values are " + this.number + " " +  this.balance + " " + this.customerName + " " + this.customerPhoneNumber +  this.customerEmailAddress);
    }


    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this(999, 12.36, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public void depositFunds(int funds) {
        this.balance += funds;
    }

    public void withdrawFunds(int funds) {
        if (balance - funds >= 0){
            this.balance -= funds;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
