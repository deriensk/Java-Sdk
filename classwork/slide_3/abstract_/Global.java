public class Global extends Bank {

	
	@Override
    public String getBankName() {
        return "Global bank";
    }

	@Override
	public int getRate(){
		return 60;
	}
	
}