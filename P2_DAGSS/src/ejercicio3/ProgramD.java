package ejercicio3;

public class ProgramD implements Runnable {
	
	public void run() {
		try {
			System.out.println("[INICIO] ProgramD");
			Thread.sleep(4);
			System.out.println("[FIN] ProgramD");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}
}
