package ejercicio3;

public class ProgramF implements Runnable {
	
	public void run() {
		try {
			System.out.println("[INICIO] ProgramF");
			Thread.sleep(4);
			System.out.println("[FIN] ProgramF");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}
}
