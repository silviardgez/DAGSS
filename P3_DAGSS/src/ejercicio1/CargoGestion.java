package ejercicio1;

public class CargoGestion extends Complemento {
	private boolean gestion;
	
	public CargoGestion(Nomina base, boolean gestion){
		super(base);
		this.gestion = gestion;
	}

	@Override
	public float calcularNomina() {
		float cargoGestion = this.gestion? 15: 0;
		return getNomina().calcularNomina() + cargoGestion;
	}
}
