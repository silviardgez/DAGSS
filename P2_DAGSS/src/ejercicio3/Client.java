package ejercicio3;

public class Client {

	public static void main(String[] args) {

		Trabajo programA = TrabajoBuilder.newSerial().thatRuns(new ProgramA()).build();

		Trabajo programDF = TrabajoBuilder.newSerial().thatRuns(new ProgramD())
				.andAlsoRuns(TrabajoBuilder.newSerial().thatRuns(new ProgramF()).build()).build();
		Trabajo programBCDF = TrabajoBuilder.newParalell().thatRuns(new ProgramB()).andAlsoRuns(new ProgramC())
				.andAlsoRuns(programDF).build();
		
		Trabajo programE = TrabajoBuilder.newSerial().thatRuns(new ProgramE()).build();
		
		Trabajo completo = TrabajoBuilder.newSerial().thatRuns(programA).andAlsoRuns(programBCDF).andAlsoRuns(programE).build();

		completo.run();
	}

}
