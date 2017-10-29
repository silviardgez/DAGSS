package ejercicio2;

public class ProgramD extends Program {
	boolean finalizado = false;

	public void _run() {
		super.setChanged();
		super.notifyObservers();
		try {
			System.out.println("[INICIO] ProgramD");
			Thread.sleep(4);
			System.out.println("[FIN] ProgramD");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		finalizado = true;
		super.setChanged();
		super.notifyObservers();
	}

}