package it.edu.iisgubbio.threads;

public class ThreadA extends Thread{
	
	public void stop(int x) {
		if(x==5) {
			this.stop();
		}
	}
	
	public void run () {
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			stop(i);
		}
	}
	
}
