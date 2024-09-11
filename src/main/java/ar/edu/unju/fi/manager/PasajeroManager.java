package ar.edu.unju.fi.manager;

import java.util.List;

import ar.edu.unju.fi.domain.Pasajero;
import ar.edu.unju.fi.util.VerificacionDeContraseña;

public class PasajeroManager {
	private Manager manager;
	
	public PasajeroManager(Manager manager) {
		this.manager = manager;
	}

	public boolean registrarPasajero(Pasajero pasajero) {
		if (VerificacionDeContraseña.validar(pasajero.getContraseña())) {
			manager.getPasajeros().add(pasajero);
			return true;
		}
		return false;
	}
	
	public List<Pasajero> getPasajeros() {
        return manager.getPasajeros();
    }
}
