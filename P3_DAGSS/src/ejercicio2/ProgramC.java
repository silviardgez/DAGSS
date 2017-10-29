package ejercicio2;

public class ProgramC extends Program {
	boolean finalizado = false;

	public void _run() {
		super.setChanged();
		super.notifyObservers();
		try {
			System.out.println("[INICIO] ProgramC");
			Thread.sleep(7);
			System.out.println("[FIN] ProgramC");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		finalizado = true;
		super.setChanged();
		super.notifyObservers();
	}

}