package ejercicio2;

public class ProgramB extends Program {
	boolean finalizado = false;

	public void _run() {
		super.setChanged();
		super.notifyObservers();
		try {
			System.out.println("[INICIO] ProgramB");
			Thread.sleep(10);
			System.out.println("[FIN] ProgramB");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		finalizado = true;
		super.setChanged();
		super.notifyObservers();
	}

}