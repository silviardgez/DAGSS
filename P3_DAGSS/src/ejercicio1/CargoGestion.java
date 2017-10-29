package ejercicio1;

public class CargoGestion extends Complemento {
	
	public CargoGestion(Nomina base){
		super(base);
	}

	@Override
	public float calcularNomina() {
		return getNomina().calcularNomina() + 15;
	}
}
