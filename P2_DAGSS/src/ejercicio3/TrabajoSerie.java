package ejercicio3;


public class TrabajoSerie extends Trabajo {
	public void run(){
		for(Runnable r : subprogramas){
			r.run();
		}
	}
}
