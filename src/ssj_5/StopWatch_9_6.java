package ssj_5;


public class StopWatch_9_6 {
	private long startTime,endTime;
	StopWatch_9_6 (){
		startTime= System.currentTimeMillis();
	}
	public void start() {
		startTime= System.currentTimeMillis();
	}
	public void stop() {
		endTime= System.currentTimeMillis();
	}
	public long getElapsedTime() {
		return -(startTime-endTime);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch_9_6 myStopWatch =new StopWatch_9_6();
		int[] A = new int[100000];
		int i;
		for(i=0;i<100000;i++)
			A[i]=((int)(Math.random()*10000000)) % 10000;
		myStopWatch.start();
		for(i=0;i<100000;i++) {
			int max=i;
			for(int j=i+1;j<100000;j++)
			{
			if(A[j]>A[max])
			max=j;
			}
			int temp=A[max];
			A[max]=A[i];
			A[i]=temp;
			}
		myStopWatch.stop();
		System.out.println("≈≈–Ú ±º‰£®ms£©£∫"+myStopWatch.getElapsedTime());
		
	}

}
