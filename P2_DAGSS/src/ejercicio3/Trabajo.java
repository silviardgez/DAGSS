package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public abstract class Trabajo implements Runnable {
	List<Thread> hilosHijo = new ArrayList<>();
	List<Runnable> subprogramas;
	
	public void run(){
		for (Runnable r: subprogramas){
			Thread t = new Thread(r);
			hilosHijo.add(t);
			t.start();
		}
		
		for(Thread t: hilosHijo){
			try {
				t.join();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
