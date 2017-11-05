package ds.calculator;

import java.util.ArrayList;
import java.util.List;

import ds.miniframework.Operation;

public class Suma extends Operation {
	private String sumandoA;
	private String sumandoB;
	
	public Suma() {
		this.sumandoA = "Sumando A";
		this.sumandoB = "Sumando B";
		
	}
	
	@Override
	public String getName() {
		return "Suma";
	}

	@Override
	public List<String> getParameters() {
		List<String> parameters = new ArrayList<>();
		parameters.add(this.sumandoA);
		parameters.add(this.sumandoB);
		return parameters;
	}

	@Override
	public String execute(List<String> list) {
		float suma = 0;
		for(String parameter : list){
			suma += Float.parseFloat(parameter);
		}
		return Float.toString(suma);
	}

}
