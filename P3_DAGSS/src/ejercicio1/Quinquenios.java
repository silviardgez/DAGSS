package ejercicio1;

public class Quinquenios extends Complemento {
	private int num;
	
	public Quinquenios(Nomina base, int num){
		super(base);
		this.num = num;
	}
	
	public float calcularNomina(){
		return getNomina().calcularNomina() + 20*this.num;
	}
}
