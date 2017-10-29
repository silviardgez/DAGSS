package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrdenPago {

	public static void main(String[] args) throws FileNotFoundException {
		final String NAME = "trabajadores.txt";

		File file = new File(NAME);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] tokens = line.split("\t");
			if (tokens.length != 4) {
				throw new IllegalArgumentException("the line does not contain 4 tokens");
			}

			Nomina nomina = null;
			// Comprobamos el tipo de nómina
			if (tokens[1].equals("A")) {
				nomina = new EscalaA();
			} else if (tokens[1].equals("B")) {
				nomina = new EscalaB();
			} else if (tokens[1].equals("C")) {
				nomina = new EscalaC();
			}

			// Comprobamos la antiguedad
			int antiguedad = Integer.parseInt(tokens[2]);

			// Calcular complementos
			// Comprobamos sexenios
			int sexenio = antiguedad / 6;
			if (sexenio >= 1) {
				nomina = new Sexenios(nomina, sexenio);
			}

			// Comprobamos quinquenios
			int quinquenio = antiguedad / 5;
			if (quinquenio >= 1) {
				nomina = new Quinquenios(nomina, quinquenio);
			}
			// Comprobamos trienios
			int trienio = antiguedad / 3;
			if (trienio >= 1) {
				nomina = new Trienios(nomina, trienio);
			}

			// Comprobamos si participó en cargos de gestión
			if (tokens[3].equals("SI")) {
				nomina = new CargoGestion(nomina);
			}

			//Mostramos por pantalla las órdenes de pago
			System.out.println(tokens[0] + " " + nomina.calcularNomina());

		}
	}

}
