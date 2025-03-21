package VIew;

import java.util.concurrent.Semaphore;

import Controller.Threads_carros;

public class Principal_cruzamento {

	public static void main(String[] args){
		
		Semaphore semaforo = new Semaphore(1);
		
		Thread t = new Threads_carros("norte", 1, semaforo);
		Thread t2 = new Threads_carros("sul", 2, semaforo);
		Thread t3 = new Threads_carros("leste", 3, semaforo);
		Thread t4 = new Threads_carros("oeste", 4, semaforo);
		
		t.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
