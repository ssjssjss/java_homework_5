package ssj_5;

import java.util.GregorianCalendar;

public class GregorianCalendar_9_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar myGregorianCalendar=new GregorianCalendar();
		System.out.printf("Current time: %d-%d-%d\n",myGregorianCalendar.get(GregorianCalendar.YEAR),myGregorianCalendar.get(GregorianCalendar.MONTH),myGregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
		myGregorianCalendar.setTimeInMillis(1234567898765L);
		System.out.printf("Set time: %d-%d-%d\n",myGregorianCalendar.get(GregorianCalendar.YEAR),myGregorianCalendar.get(GregorianCalendar.MONTH),myGregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
	}

}
