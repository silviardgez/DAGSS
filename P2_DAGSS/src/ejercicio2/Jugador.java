package ejercicio2;

import java.util.LinkedList;
import java.util.List;

public abstract class Jugador {
	protected List<Artillero> artilleros = new LinkedList<Artillero>();
	protected List<Zapador> zapadores = new LinkedList<Zapador>();
	protected SoldadosFactory soldado;
	
	public Jugador(SoldadosFactory soldado) {
		
		this.soldado = soldado;
		artilleros.add(soldado.crearArtillero());
		artilleros.add(soldado.crearArtillero());
		zapadores.add(soldado.crearZapador());
		zapadores.add(soldado.crearZapador());

	}

	public abstract void jugar();
}
