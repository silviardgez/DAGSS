package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JuegoEstrategia {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		Jugador humano = null;
		Jugador maquina = null;
		
		// Pedimos el equipo al jugador
		System.out.println("¿Qué equipo desea? [a=atreides, h=harkonen");
		line = in.readLine();
		if (line.startsWith("a")) {
			humano = new JugadorHumano(new AtreidesSoldadosFactory());
			maquina = new JugadorMaquina(new HarkonenSoldadosFactory());
		} else if (line.startsWith("h")) {
			humano = new JugadorHumano(new HarkonenSoldadosFactory());
			maquina = new JugadorMaquina(new AtreidesSoldadosFactory());
		}

		while (true) {
			System.out.println("JUEGA MAQUINA");
			maquina.jugar();
			System.out.println("JUEGA HUMANO");
			humano.jugar();
		}
	}

}
