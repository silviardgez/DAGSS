package ejercicio1;

public class AtreidesSoldadosFactory implements SoldadosFactory{
	
	public ArtilleroAtreides crearArtillero(){
		ArtilleroAtreides artilleroAtreides = new ArtilleroAtreides();
		return artilleroAtreides;
	}
	
	public ZapadorAtreides crearZapador(){
		ZapadorAtreides zapadorAtreides = new ZapadorAtreides();
		return zapadorAtreides;
	}
}
