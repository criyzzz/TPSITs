package it.edu.iisgubbio.threads;

public class Principale {

	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		
		t1.start();
		t2.start();
	}


}