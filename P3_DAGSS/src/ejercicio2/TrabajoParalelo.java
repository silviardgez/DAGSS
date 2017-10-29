package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TrabajoParalelo extends Trabajo {
	List<Thread> hilosHijo = new ArrayList<>();
	
	public void run(){
		for (Runnable r: this.subprogramas){
			Thread t = new Thread(r);
			this.hilosHijo.add(t);
			t.start();
		}
		
		for(Thread t: this.hilosHijo){
			try {
				t.join();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
