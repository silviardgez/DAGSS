package ejercicio2;

public class HarkonenSoldadosFactory implements SoldadosFactory {
	public ArtilleroHarkonen crearArtillero(){
		ArtilleroHarkonen artilleroHarkonen = new ArtilleroHarkonen();
		return artilleroHarkonen;
	}
	public ZapadorHarkonen crearZapador(){
		ZapadorHarkonen zapadorHarkonen = new ZapadorHarkonen();
		return zapadorHarkonen;
	}
}
