package com.java.CollectionExamples;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws InterruptedException {
		
		LiftManager Lm=new LiftManager();
		Lm.start();
	}
}

class LiftManager extends Thread {

	public final static int storey = 15;
	public int presentFloorElev=0;
	public int presentFloorUser=6;
	public int destnFloor=5;

	public void requestForElev() throws InterruptedException {
		for (int i = presentFloorElev; i >= presentFloorUser; i--) {
			System.out.print(i + "\t");
			Thread.sleep(1000);

		}
		System.out.print("OD\t");
	}

	public void requestForDestn() throws InterruptedException {
		System.out.print("CD+\t");
		for (int i = presentFloorUser; i <= destnFloor; i++) {
			System.out.print(i + "\t");
			Thread.sleep(1000);
		}
		
	}


	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		
		String threadName = Thread.currentThread().getName();
		
		if (threadName.equals("t1")) {
			try {
				requestForElev();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (threadName.equals("t2")) {
			try {
				requestForDestn();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
