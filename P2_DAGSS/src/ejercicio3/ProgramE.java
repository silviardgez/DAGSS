package ejercicio3;

public class ProgramE implements Runnable {
	
	public void run() {
		try {
			System.out.println("[INICIO] ProgramE");
			Thread.sleep(10);
			System.out.println("[FIN] ProgramE");
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}
}
