package Controller;

import java.util.concurrent.Semaphore;

public class Threads_carros extends Thread{

	private String sentido;
	private int carro;
	private Semaphore s;
	
	public Threads_carros(String sentido, int carro, Semaphore semaforo) {
	this.sentido = sentido;	
	this.carro = carro;
	s = semaforo;
	}
	
	public void run() {
	
		try {
			s.acquire();
			System.out.println("\nSentido "+sentido+" está verde");
			passando();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			s.release();
		}
		
		
	}

	private void passando() {
		
		System.out.println("Carro "+carro+" está passando no sentido "+sentido);
		
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
