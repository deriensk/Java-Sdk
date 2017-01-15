public class VipCustomerTest{
	public static void main(String[] args) {
		
		VipCustomer customer1 = new VipCustomer();
		System.out.println(customer1.getName());
		System.out.println(customer1.getCreditLimit());
		System.out.println(customer1.getEmail());

		VipCustomer customer2 = new VipCustomer("CUSTOMER SECOND", "c2@gmail.com");
		System.out.println(customer2.getName());
		System.out.println(customer2.getCreditLimit());
		System.out.println(customer2.getEmail());

		VipCustomer customer3 = new VipCustomer("CUSTOMER THIRED", 5000d, "c3@gmail.com");
		System.out.println(customer3.getName());
		System.out.println(customer3.getCreditLimit());
		System.out.println(customer3.getEmail());


	}
}