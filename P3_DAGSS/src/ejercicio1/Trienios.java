package ejercicio1;

public class Trienios extends Complemento {
	private int num;
	
	public Trienios(Nomina base, int num){
		super(base);
		this.num = num;
	}
	
	public float calcularNomina(){
		return getNomina().calcularNomina() + 10*this.num;
	}
}
