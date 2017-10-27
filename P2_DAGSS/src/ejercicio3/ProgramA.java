package ejercicio3;

public class ProgramA implements Runnable {

	public void run() {
		try {
			System.out.println("[INICIO] ProgramA");
			Thread.sleep(10);
			System.out.println("[FIN] ProgramA");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}

}
