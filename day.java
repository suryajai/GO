import java.util.*;
public class day {
	public static void main(String[] args) {
	Calendar startDate = Calendar.getInstance();
	startDate.set(2012, Calendar.OCTOBER, 06);
	if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) 
	{
	    System.out.println("true");
	}
	else {
	    System.out.println("FALSE");
	}
	}
}



