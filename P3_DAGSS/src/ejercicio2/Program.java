package ejercicio2;

import java.util.Observable;

abstract class Program extends Observable {
	protected boolean finalizado = false;

	public void run() {
		super.setChanged();
		super.notifyObservers();
		_run();
		finalizado = true;
		super.setChanged();
		super.notifyObservers();
	}

	protected abstract void _run();
}
