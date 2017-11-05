package ds.miniframework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class App implements Observer {
	private List<Operation> operations;
	private Operation[] operation;
	private int cuenta = 0;

	public abstract List<Operation> createOperations();

	@Override
	public void update(Observable observable, Object arg) {
		Operation observado = (Operation) observable;
		this.cuenta = this.cuenta + (observado.getProgress() == 100 ? -1 : 1);

		try {
			Logger.getInstance().log("Programa " + (observado.getProgress() == 100 ? "finalizado" : "iniciado"),
					Logger.INFO);
			Logger.getInstance().log(cuenta + " programas en curso", Logger.INFO);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void start() throws IOException {
		while (true) {
			Logger.getInstance().log("Seleccione una de las opciones: ", Logger.INFO);

			// Se guardan las operaciones disponibles y se muestran por pantalla
			operations = createOperations();
			operation = new Operation[operations.size()];
			
			int i = 0;
			for (Operation op : operations) {
				operation[i] = op;
				Logger.getInstance().log("Opción " + i + ". " + op.getName(), Logger.INFO);
				i++;
			}

			// Se introduce una opción al final que sea salir del programa
			Logger.getInstance().log("Opción " + i + ". Salir", Logger.INFO);

			// Se lee la opción seleccionada por el usuario
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();

			int numOper = -1;
			int opcion = -1;

			// Se comprueba si lo que fue introducido por pantalla es un número
			boolean isNumeric;
			try {
				opcion = Integer.parseInt(line);
				isNumeric = true;
			} catch (NumberFormatException nfe) {
				isNumeric = false;
				Logger.getInstance().log("Se ha introducido " + line + ". Entrada incorrecta.", Logger.ERROR);
			}

			// Si el número introducido es correcto se asigna a numOper
			if (isNumeric == true && opcion < operation.length) {
				numOper = opcion;
			} else if (line.equals(Integer.toString(i))) {
				// Si se selecciona la última opción termina el programa
				System.exit(-1);
			} else {
				Logger.getInstance().log("El número introducido no corresponde a ninguna opción.", Logger.ERROR);
			}

			// Comprobar que se asignó un número a numOper
			if (numOper != -1) {
				// Pedir los parámteros necesarios para la operación
				Logger.getInstance().log("Introduzca los siguientes parámetros separados por un espacio: ",
						Logger.INFO);
				Logger.getInstance().log(operation[numOper].getParameters().toString(), Logger.INFO);
				InputStreamReader isr0 = new InputStreamReader(System.in);
				BufferedReader br0 = new BufferedReader(isr0);

				// Se ejecuta la operación con los parámetros obtenidos
				String[] parameters;
				if ((parameters = br0.readLine().split(" ")).length == operation[numOper].getParameters().size()) {
					List<String> readParameters = new ArrayList<>(Arrays.asList(parameters));
					Logger.getInstance().log("El resultado es: " + operation[numOper].execute(readParameters) + "\n",
							Logger.INFO);
				}
			}


		}

	}

}
