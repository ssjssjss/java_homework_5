package ssj_5;

import java.util.Random;

public class Random_9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random myrandom=new Random(1000);
		for(int i=0;i<50;i++) {
			System.out.print(myrandom.nextInt(100)+"\n");
		}
	}

}
