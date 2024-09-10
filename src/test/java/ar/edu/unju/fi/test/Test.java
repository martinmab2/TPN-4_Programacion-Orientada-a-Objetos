package ar.edu.unju.fi.test;

import ar.edu.unju.fi.domain.Pasajero;
import ar.edu.unju.fi.manager.Manager;

public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.precargarPasajeros();
		for (Pasajero pasajero : manager.mostrarListaDePasajeros()) {
			System.out.println(pasajero);
		}
	}

}
