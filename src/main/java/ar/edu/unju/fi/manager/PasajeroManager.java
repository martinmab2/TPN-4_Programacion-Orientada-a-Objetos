package ar.edu.unju.fi.manager;

import java.util.List;

import ar.edu.unju.fi.domain.Pasajero;
import ar.edu.unju.fi.util.VerificacionDeContraseña;

/**
 * Clase encargada de gestionar las operaciones relacionadas con los pasajeros,
 * como el registro y la validación de datos.
 * <p>
 * La clase proporciona métodos para registrar nuevos pasajeros, así como para 
 * añadir acompañantes a la lista de pasajeros si cumplen con los criterios 
 * de validación.
 * </p>
 */
public class PasajeroManager {
    
    /**
     * Instancia de la clase {@link Manager} que proporciona la lista de pasajeros.
     */
    private Manager manager;
    
    /**
     * Constructor de la clase. Inicializa el {@link Manager} que se utilizará 
     * para acceder a la lista de pasajeros.
     * 
     * @param manager La instancia del {@link Manager} que gestiona la lista de pasajeros.
     */
    public PasajeroManager(Manager manager) {
        this.manager = manager;
    }

    /**
     * Registra un nuevo pasajero en la lista de pasajeros si la contraseña es 
     * válida según las reglas de verificación.
     * 
     * @param pasajero El pasajero a registrar.
     * @return {@code true} si el pasajero fue registrado exitosamente; 
     *         {@code false} si la contraseña no es válida.
     */
    public boolean registrarPasajero(Pasajero pasajero) {
        if (VerificacionDeContraseña.validar(pasajero.getContraseña())) {
            manager.getPasajeros().add(pasajero);
            return true;
        }
        return false;
    }
    
    /**
     * Devuelve la lista de pasajeros gestionados por el {@link Manager}.
     * 
     * @return Lista de pasajeros.
     */
    public List<Pasajero> getPasajeros() {
        return manager.getPasajeros();
    }
    
    /**
     * Registra un acompañante en la lista de pasajeros si no existe ya un pasajero
     * con el mismo DNI.
     * 
     * @param acompanante El acompañante a registrar.
     * @return {@code true} si el acompañante fue registrado exitosamente; 
     *         {@code false} si el acompañante es {@code null} o ya existe en 
     *         la lista de pasajeros.
     */
    public boolean registrarAcompanante(Pasajero acompanante) {
        if (acompanante == null) {
            return false;
        }
        List<Pasajero> pasajeros = manager.getPasajeros();
        for (Pasajero pasajero : pasajeros) {
            if (pasajero.getDni().equals(acompanante.getDni())) {
                return false;
            }
        }
        pasajeros.add(acompanante);
        return true;
    }
}

