package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JugadorHumano extends Jugador {


	public JugadorHumano(SoldadosFactory soldado) {
		super(soldado);

	}

	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void jugar() {
		System.out.println("Qué hago? [d=disparar, b=poner bombas, a=crear_artillero, z=crear_zapador");
		String line;
		try {
			line = in.readLine();
			if (line.startsWith("d")) {
				for (Artillero a : artilleros) {
					a.disparar();
				}
			}
			if (line.startsWith("b")) {
				for (Zapador z : zapadores) {
					z.ponerBomba();
				}
			}

			// [PUNTO DE REFACTORIZACION]
			if (line.startsWith("a")) {

				this.artilleros.add(this.soldado.crearArtillero());

			}

			if (line.startsWith("z")) {

				this.zapadores.add(this.soldado.crearZapador());

			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
