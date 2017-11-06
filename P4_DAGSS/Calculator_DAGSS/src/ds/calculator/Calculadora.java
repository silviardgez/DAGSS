package ds.calculator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ds.miniframework.App;
import ds.miniframework.Operation;

public class Calculadora extends App {

	static ArrayList<Operation> res;
	
	@Override
	public List<Operation> createOperations() {
		res = new ArrayList<>();
		
		//Se crean las operaciones
		Operation suma = new Suma();
		Operation divide = new Divide();
		Operation raiz = new ProtectedOperation(new Raiz());
		
		//Se les añade un observador
		suma.addObserver(this);
		divide.addObserver(this);
		raiz.addObserver(this);
		
		//Se añaden al ArrayList que se devolverá
		res.add(suma);
		res.add(divide);
		res.add(raiz);
		return res;
	}
	
	public static void main(String args[]) throws IOException {
		Calculadora calc = new Calculadora();		
		calc.start();
	}
}
