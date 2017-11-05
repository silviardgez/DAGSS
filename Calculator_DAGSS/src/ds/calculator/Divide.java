package ds.calculator;

import java.util.ArrayList;
import java.util.List;

import ds.miniframework.Operation;

public class Divide extends Operation {
	private String dividendo;
	private String divisor;
	
	public Divide() {
		this.dividendo = "Dividendo";
		this.divisor = "Divisor";
	}
	
	@Override
	public String getName() {
		return "Divide";
	}

	@Override
	public List<String> getParameters() {
		List<String> parameters = new ArrayList<>();
		parameters.add(this.dividendo);
		parameters.add(this.divisor);
		return parameters;
	}

	@Override
	public String execute(List<String> list) {
		float divide = 0;
		this.dividendo = list.get(0);
		this.divisor = list.get(1);
		divide = Float.parseFloat(this.dividendo)/ Float.parseFloat(this.divisor);
		return Float.toString(divide);
	}

}
