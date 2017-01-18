public class Account {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    //passing all the parameters (mike's account)
    public Account(){
        this(20145, 0.0, "Default name", "default@gmail.com", "(024) 215 6985");
        System.out.println("Empty constructor called.");
    }

    //passing two default arguments (dean's account)
    public Account(String customerName, String email, String phoneNumber) {
        this(201532, 120d, customerName, email, phoneNumber);

    }

    // myAccount
    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account class called with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Amount " + depositAmount + " has been deposited in your account." );
        System.out.println("Your current balance is " + this.balance);

    }

    public void withdraw(double withdrawAmount){
        if (this.balance - withdrawAmount < 0){
            System.out.println("Insufficient amount to withdraw. Your balance is " + this.balance);
        }
        else{
            this.balance -= withdrawAmount;
            System.out.println("Amount " + withdrawAmount + " has been withdrawn from your account." );
            System.out.println("Your current balance is " + this.balance);
        }
    }
}
