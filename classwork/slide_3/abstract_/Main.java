public class Main{
	public static void main(String[] args) {
		
		Bank nabil = new Nabil();
		System.out.println("===method one===");
		System.out.println(nabil.getBankName());
		System.out.println("===method two===");
		printBankInfo(nabil);

		System.out.println("For global bank");
		Bank global = new Global();
		printBankInfo(global);


		System.out.println("For nabil bank");
		Bank nabil = new Global();
		printBankInfo(nabil);
	}

	public static void printBankInfo(Bank b){

		System.out.println(b.getBankName());
		System.out.println(b.getRate());

	}
	
}