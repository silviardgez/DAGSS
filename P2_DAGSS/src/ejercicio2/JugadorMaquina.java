package ejercicio2;

public class JugadorMaquina extends Jugador {
	
	public JugadorMaquina(SoldadosFactory soldado) {
		super(soldado);
	}

	public void jugar() {
		//disparamos!
		for (Artillero artillero: artilleros){
			artillero.disparar();
		}
		
		//ponemos bombas!
		for (Zapador zapador: zapadores){
			zapador.ponerBomba();
		}

	}

}
