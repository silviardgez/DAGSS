package ejercicio2;

public class ProgramE extends Program {
	boolean finalizado = false;

	public void _run() {
		super.setChanged();
		super.notifyObservers();
		try {
			System.out.println("[INICIO] ProgramE");
			Thread.sleep(10);
			System.out.println("[FIN] ProgramE");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		finalizado = true;
		super.setChanged();
		super.notifyObservers();
	}

}