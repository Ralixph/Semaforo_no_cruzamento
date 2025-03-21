package VIew;

import java.util.concurrent.Semaphore;

import Controller.Threads_carros;

public class Principal_cruzamento {

	public static void main(String[] args){
		
		Semaphore semaforo = new Semaphore(1);
		
		Thread t = new Threads_carros("norte", semaforo);
		Thread t2 = new Threads_carros("sul", semaforo);
		Thread t3 = new Threads_carros("leste", semaforo);
		Thread t4 = new Threads_carros("oeste", semaforo);
		
		t.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
