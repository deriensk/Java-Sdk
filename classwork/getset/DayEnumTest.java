public class DayEnumTest{

	public static void showDay(DayEnum d){

		switch (d){
			case SUNDAY:
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
			case SATURDAY:
				System.out.println("Today is " + d);
				break;
			default:
				break;	

		}
	}

	public static void main(String[] args) {
		DayEnum d = DayEnum.TUESDAY;
		showDay(d);
		showDay(DayEnum.FRIDAY);
	}
}