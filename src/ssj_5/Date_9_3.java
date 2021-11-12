package ssj_5;

import java.util.Date;

public class Date_9_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=10000;
		Date myDate=new Date(n);
		for(int i=0;i<8;i++) {
		myDate.setTime(n);
		n*=10;
		System.out.print(myDate.toString()+"\n");
		}
		
	}

}
