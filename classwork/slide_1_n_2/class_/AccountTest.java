public class AccountTest{
	public static void main(String[] args) {

			
		Account myAccount = new Account();
        myAccount.deposit(50);
        myAccount.deposit(200);
        myAccount.withdraw(200);
        myAccount.withdraw(500);


        Account mikeAccount = new Account(5550369, 0.0,"Mr. Mike",
                "mike@gmail.com", "(123) 456 7890");
        System.out.println(mikeAccount.getBalance());
        System.out.println(mikeAccount.getEmail());
        mikeAccount.withdraw(60);
        mikeAccount.deposit(200);
        mikeAccount.withdraw(150);


        
        Account deanAccount = new Account("Dean",
                "dean@gmail.com", "(456) 458 7854");
        System.out.println(deanAccount.getAccountNumber());
        System.out.println(deanAccount.getBalance());
        System.out.println(deanAccount.getEmail());
        

	}
}

/*Account class called with parameters
Empty constructor called.
Amount 50.0 has been deposited in your account.
Your current balance is 50.0
Amount 200.0 has been deposited in your account.
Your current balance is 250.0
Amount 200.0 has been withdrawn from your account.
Your current balance is 50.0
Insufficient amount to withdraw. Your balance is 50.0
Account class called with parameters
0.0
mike@gmail.com
Insufficient amount to withdraw. Your balance is 0.0
Amount 200.0 has been deposited in your account.
Your current balance is 200.0
Amount 150.0 has been withdrawn from your account.
Your current balance is 50.0
*/