package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TrabajoBuilder {
	List <Runnable> hijos = new ArrayList<>();
	private boolean isParalell;
	
	public TrabajoBuilder(boolean isParalell){
		this.isParalell = isParalell;
	}
	
	static TrabajoBuilder newParalell(){
		return new TrabajoBuilder(true);
	}
	
	static TrabajoBuilder newSerial(){
		return new TrabajoBuilder(false);
	}
	
	public TrabajoBuilder thatRuns(Runnable r){
		hijos.add(r);
		return this;
	}
	
	public TrabajoBuilder andAlsoRuns(Runnable r){
		return thatRuns(r);
	}
	
	public Trabajo build(){
		Trabajo t = this.isParalell? new TrabajoParalelo(): new TrabajoSerie();
		t.subprogramas = hijos;
		return t;
	}
}
