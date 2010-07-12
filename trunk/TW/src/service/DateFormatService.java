package service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatService {
	public static String changeDateToStrig(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String time = dateFormat.format(date);
		return time;
	}
	
	
}
