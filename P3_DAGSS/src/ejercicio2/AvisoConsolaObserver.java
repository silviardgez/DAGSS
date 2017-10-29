package ejercicio2;

import java.util.Observable;
import java.util.Observer;

public class AvisoConsolaObserver implements Observer {
	private int cuenta = 0;
	
	@Override
	public synchronized void update(Observable observable, Object params) {
		Program observado = (Program)observable;
		this.cuenta = this.cuenta + (observado.finalizado ? -1:1);
		System.out.println("Programa " + (observado.finalizado ? "finalizado": "iniciado"));
		System.out.println(cuenta + " programas en curso");
		
	}

}
