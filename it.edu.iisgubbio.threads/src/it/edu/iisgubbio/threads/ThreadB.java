package it.edu.iisgubbio.threads;

public class ThreadB extends Thread{
	public void stop(int x) {
		if(x==50) {
			this.stop();
		}
	}
	
	public void run () {
		for(int i = 10; i<100; i++) {
			System.out.println(i);
			stop(i);
		}
	}
	
}