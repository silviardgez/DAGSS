package ejercicio3;

public class ProgramB implements Runnable {
	
	public void run() {
		try {
			System.out.println("[INICIO] ProgramB");
			Thread.sleep(10);
			System.out.println("[FIN] ProgramB");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}
}
