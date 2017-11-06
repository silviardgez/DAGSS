package ds.calculator;

import java.util.ArrayList;
import java.util.List;

import ds.miniframework.Operation;

public class Raiz extends Operation {
	private String numeroRaiz;
	
	public Raiz(){
		this.numeroRaiz = "Radicando";
	}

	@Override
	public String getName() {
		return "Raiz Cuadrada";
	}

	@Override
	public List<String> getParameters() {
		List<String> parameters = new ArrayList<>();
		parameters.add(this.numeroRaiz);
		return parameters;
	}

	@Override
	public String execute(List<String> list) {
		super.setChanged();
		super.notifyObservers();
		
		for(int i=0; i<4; i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			super.setProgress(this.getProgress() + 20f);
		}
		
		this.numeroRaiz = list.get(0);
		String toRet = "No se puede realizar la raíz de un número negativo.";
		if(Float.parseFloat(numeroRaiz) >= 0){
			toRet = Double.toString(Math.sqrt(Float.parseFloat(this.numeroRaiz)));
		} 
		
		super.setProgress(100);
		return toRet;
	}
}
