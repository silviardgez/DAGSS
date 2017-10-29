package ejercicio2;

import java.util.List;

public abstract class Trabajo implements Runnable {
	List<Runnable> subprogramas;
	
	public void addSubtrabajo(Runnable r){
		Thread t = new Thread(r);
		this.subprogramas.add(t);
		
	}
}
