public enum Currency{

	PENNY(1, "penny"), NICKEL(5, "nickel"), DIME(10, "dime"), QUARTER(25, "quarter");

	int value;
	String desc;

	Currency(int value, String desc){
		this.value = value;
		this.desc = desc;
	}
}