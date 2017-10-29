package ejercicio2;


public class TrabajoSerie extends Trabajo {
	public void run(){
		for(Runnable r : this.subprogramas){
			r.run();
		}
	}
}
