package ejercicio1;

public abstract class Complemento implements Nomina {
	private Nomina base;
	
	public Complemento(Nomina base){
		this.base = base;
	}
	
	public Nomina getNomina(){
		return this.base;
	}
	
	
}
