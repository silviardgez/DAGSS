package ejercicio1;

public class Quinquenios {
	private Nomina base;
	private int num;
	
	public Quinquenios(Nomina base, int num){
		this.base = base;
		this.num = num;
	}
	
	public float calcularNomina(){
		return this.base.calcularNomina() + 20*this.num;
	}
}
