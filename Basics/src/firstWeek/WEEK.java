package firstWeek;

public class WEEK {

	public static void main(String[] args) {
    String day="MONDAY";
    if(day.equalsIgnoreCase("SATURDAY")||day.equalsIgnoreCase("SUNDAY")){
    	System.out.println("WEEKEND");
    }
    else {
    	System.out.println("WEEKDAYS");
    }
	}

}
