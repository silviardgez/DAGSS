package ejercicio2;

public class ProgramF extends Program {
	boolean finalizado = false;

	public void _run() {
		super.setChanged();
		super.notifyObservers();
		try {
			System.out.println("[INICIO] ProgramF");
			Thread.sleep(4);
			System.out.println("[FIN] ProgramF");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		finalizado = true;
		super.setChanged();
		super.notifyObservers();
	}

}