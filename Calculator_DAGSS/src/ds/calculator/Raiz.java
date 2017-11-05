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
		this.numeroRaiz = list.get(0);
		if(Float.parseFloat(numeroRaiz) >= 0){
			return Double.toString(Math.sqrt(Float.parseFloat(this.numeroRaiz)));
		}
		return "No se puede realizar la raíz de un número negativo.";
	}
}
