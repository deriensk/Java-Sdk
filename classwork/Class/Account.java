public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Amount " + depositAmount + " has been deposited in your account." );
        System.out.println("Your current balance is " + this.balance);

    }

    public void withdraw(double withdrawAmount){
        if (this.balance - withdrawAmount <= 0){
            System.out.println("Insufficient amount to withdraw. Your balance is " + this.balance);
        }else{
            this.balance -= withdrawAmount;
            System.out.println("Amount " + withdrawAmount + " has been withdrawn from your account." );
            System.out.println("Your current balance is " + this.balance);
        }
    }
}
