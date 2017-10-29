package ejercicio1;

public class Sexenios {
	private Nomina base;
	private int num;
	
	public Sexenios(Nomina base, int num){
		this.base = base;
		this.num = num;
	}
	
	public float calcularNomina(){
		return this.base.calcularNomina() + 50*this.num;
	}
}
