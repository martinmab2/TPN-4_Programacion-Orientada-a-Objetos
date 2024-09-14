package ar.edu.unju.fi.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.domain.Pasajero;
import ar.edu.unju.fi.manager.Manager;
import ar.edu.unju.fi.manager.PasajeroManager;

/**
 * Clase de prueba para la gestión de pasajeros en el sistema.
 *
 * Esta clase contiene pruebas unitarias para la clase {@link PasajeroManager}, utilizando JUnit 5.
 * Se verifica la correcta funcionalidad de los métodos relacionados con el registro y manejo de pasajeros,
 * incluyendo la validación de contraseñas y la gestión de acompañantes.
 * 
 */
public class PasajeroTest {
    private PasajeroManager pasajeroManager;
    private Manager manager;

    /**
     * Configura el entorno de pruebas antes de cada prueba.
     * Inicializa el {@link Manager} y el {@link PasajeroManager}.
     */
    @BeforeEach
    public void setUp() {
        manager = new Manager();
        pasajeroManager = new PasajeroManager(manager);
    }
    
    /**
     * Prueba el registro de un pasajero válido.
     * 
     * Verifica que un pasajero con una contraseña válida sea registrado correctamente
     * y que se añada a la lista de pasajeros.
     * 
     */
    @Test
    public void pruebaRegistrarPasajeroValido() {
        Pasajero pasajeroValido = new Pasajero("Andres", "Iniesta", "12345678", "nuevo@ejemplo.com", "Pa5sword1!");
        assertTrue(pasajeroManager.registrarPasajero(pasajeroValido));
        List<Pasajero> pasajeros = pasajeroManager.getPasajeros();
        assertTrue(pasajeros.contains(pasajeroValido));
    }

    /**
     * Prueba el registro de un pasajero no válido.
     *
     * Verifica que un pasajero con una contraseña no válida no sea registrado
     * y que no se añada a la lista de pasajeros.
     * 
     */
    @Test
    public void pruebaRegistrarPasajeroNoValido() {
        Pasajero pasajeroInvalido = new Pasajero("Juan Manuel", "Rosas", "12345678", "nuevo@ejemplo.com", "short1!");
        assertFalse(pasajeroManager.registrarPasajero(pasajeroInvalido));
        List<Pasajero> pasajeros = pasajeroManager.getPasajeros();
        assertFalse(pasajeros.contains(pasajeroInvalido));
    }

    /**
     * Prueba la visualización de la lista de pasajeros.
     * 
     * Verifica que un pasajero válido sea añadido correctamente y que la lista
     * de pasajeros refleje correctamente los datos del pasajero.
     * 
     */
    @Test
    public void pruebaMostrarPasajeros() {
        Pasajero pasajeroValido = new Pasajero("Andres", "Iniesta", "12345678", "nuevo@ejemplo.com", "Pa5sword1!");
        pasajeroManager.registrarPasajero(pasajeroValido);
        
        List<Pasajero> pasajeros = pasajeroManager.getPasajeros();
        assertTrue(pasajeros.size() > 0);
        assertEquals("Andres", pasajeros.get(15).getNombre());
    }
    
    /**
     * Prueba el registro de un nuevo acompañante.
     * 
     * Verifica que un pasajero nuevo sea añadido correctamente como acompañante
     * y que se refleje en la lista de pasajeros.
     * 
     */
    @Test
    public void pruebaRegistrarAcompananteNuevo() {
        Pasajero nuevoAcompanante = new Pasajero("Nombre", "Apellido", "12345678", "email@example.com", null);
        boolean resultado = pasajeroManager.registrarAcompanante(nuevoAcompanante);
        assertTrue(resultado, "El acompañante debería haber sido añadido.");
        assertTrue(manager.getPasajeros().contains(nuevoAcompanante), "La lista de pasajeros debería contener el nuevo acompañante.");
    }
    
    /**
     * Prueba el registro de un acompañante que ya existe.
     * 
     * Verifica que un pasajero que ya está en la lista no pueda ser añadido
     * nuevamente como acompañante.
     * 
     */
    @Test
    public void pruebaRegistrarAcompananteExistente() {
        Pasajero existente = new Pasajero("Martin Alejandro", "Bonari", "44477373", "444777373@fi.unju.edu.ar", "Password1!");
        boolean resultado = pasajeroManager.registrarAcompanante(existente);
        assertFalse(resultado, "El acompañante no debería haber sido añadido porque ya existe.");
    }
    
    /**
     * Prueba el registro de un acompañante con datos nulos.
     * 
     * Verifica que un valor {@code null} no pueda ser registrado como acompañante.
     */
    @Test
    public void pruebaRegistrarAcompananteNull() {
        boolean resultado = pasajeroManager.registrarAcompanante(null);
        assertFalse(resultado, "El acompañante no debería haber sido añadido porque es null.");
    }
}

