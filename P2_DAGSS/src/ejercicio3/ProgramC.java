package ejercicio3;

public class ProgramC implements Runnable {
	
	public void run() {
		try {
			System.out.println("[INICIO] ProgramC");
			Thread.sleep(7);
			System.out.println("[FIN] ProgramC");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}
}
