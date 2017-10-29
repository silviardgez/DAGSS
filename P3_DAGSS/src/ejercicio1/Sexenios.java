package ejercicio1;

public class Sexenios extends Complemento {
	private int num;
	
	public Sexenios(Nomina base, int num){
		super(base);
		this.num = num;
	}
	
	public float calcularNomina(){
		return getNomina().calcularNomina() + 50*this.num;
	}
}
