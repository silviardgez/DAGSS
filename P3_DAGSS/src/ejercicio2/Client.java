package ejercicio2;

public class Client {

	public static void main(String[] args) {
		AvisoConsolaObserver avisador = new AvisoConsolaObserver();
		
		Program pa = new ProgramA();
		pa.addObserver(avisador);
		Program pb = new ProgramB();
		pb.addObserver(avisador);
		Program pc = new ProgramC();
		pc.addObserver(avisador);
		Program pd = new ProgramD();
		pd.addObserver(avisador);
		Program pe = new ProgramE();
		pe.addObserver(avisador);
		Program pf = new ProgramF();
		pf.addObserver(avisador);
		
	}

}
