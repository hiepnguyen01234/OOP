package bai4;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class QLKH {
	public static void main(String args[]) {
	  Calendar cal =Calendar.getInstance();
	  System.out.println(cal.getTime());
	  cal.set(2015, 11, 15);
	  System.out.println(cal.getTime());
	}

}
